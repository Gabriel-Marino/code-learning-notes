"use strict";

import { Installments } from './installments.js';

export class Funding
{
    #tax;
    #term;
    #installments = [];
    constructor(mortage, entry, tax, term)
    {
        this.#tax = tax;
        this.#term = term;
        this.#installments.push(new Installments(0, 0, 0, 0, mortage - entry));
    }

    get installments()
    {
        return this.#installments;
    }

    static calculateFee (amount, tax)
    {
        return amount * tax / 100;
    }

    calculateMonthlyPayment()
    {
        let index = this.#installments.length - 1;
        let balance = this.#installments[index].balance();
        let term = this.#term - index;
        let amortization = balance / term;

        for (let i = 0; i < term; i++)
        {
            const number = this.#installments.length;
            const  fee = Funding.calculateFee(balance, this.#tax);
            const value = amortization + fee;
            balance -= amortization;
            if (balance < 0) balance = 0;

            this.#installments.push(new Installments(number, value, fee, amortization, balance));
        }
    }

    showInstallments()
    {
        const tbody = document.querySelector("#table-body");
        const installments = this.#installments.slice(1);
        for (let installment of installments)
        {
            const line = tbody.insertRow(-1);
            for (let property in installment.dataFormatted())
            {
                const cell = line.insertCell(-1);
                cell.textContent = property;
            }
        }
    }
}