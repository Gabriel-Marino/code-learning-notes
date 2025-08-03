"use strict";

import { Funding } from './funding.js';
import { Installments } from './installments.js';

export class FundingWShortage extends Funding
{
    #shortage;
    #fee;
    #installments = [];
    constructor (mortage, entry, tax, term, shortage)
    {
        super(mortage, entry, tax, term);
        this.#fee = tax;
        this.#shortage = shortage;
        this.#installments = super.installments();
    }

    calculateMonthlyPayment()
    {
        let index = this.#installments.length - 1;
        let balance = this.#installments[index].balance();
        for (let i = 1; i < this.#shortage+1; i++)
        {
            const num = this.#installments.length;
            balance += Funding.calculateFee(balance, this.#fee);
            this.#installments.push(new Installments(num, 0, 0, 0, balance));
        }
        super.calculateMonthlyPayment();
    }
}