"use strict";

export class Installments
{
    #fee;
    #number;
    #amount;
    #balance;
    #amortization;
    constructor(number, amount, fee, amortization, balance)
    {
        this.#fee = fee;
        this.#number = number;
        this.#amount = amount;
        this.#balance = balance;
        this.#amortization = amortization;
    }

    get dataFormatted()
    {
        const data = [];
        data.push(this.#number);
        data.push(this.#amount.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' }));
        data.push(this.#amortization.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' }));
        data.push(this.#fee.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' }));
        data.push(this.#balance.toLocaleString('pt-BR', { style: 'currency', currency: 'BRL' }));
        return data;
    }

    get balance()
    {
        return this.#balance;
    }
}