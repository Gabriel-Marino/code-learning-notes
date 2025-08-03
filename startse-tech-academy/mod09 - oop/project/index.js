"use strict";

import { Funding } from "./funding";
import { FundingWShortage } from "./shortage";

const shortage = document.querySelector("#with-shortage");
const list = document.querySelector("#shortage-list");
shortage.addEventListener("change", () => {
    // list.classList.toggle("hidden");
    if (this.checked)
    {
        list.removeAttribute("hidden");
    } else {
        list.setAttribute("hidden", "hidden");
    }
});

const tbody = document.querySelector("#table-body");
function clearTable()
{
    while (tbody.firstChild) tbody.removeChild(tbody.firstChild);
}

const mortageIn = document.querySelector("#mortage-inpurt");
const entryIn = document.querySelector("#entry-value");
const taxIn = document.querySelector("#fee-tax");
const termIn = document.querySelector("#term-months");
const calculateButton = document.querySelector("#calculate-button");

calculateButton.addEventListener("click", () => {
    clearTable();
    const mortage = parseFloat(mortageIn.value);
    const entryValue = parseFloat(entryIn.value);
    const feeTax = parseFloat(taxIn.value);
    const term = parseFloat(termIn.value);

    let simulation = new Funding(mortage, entryValue, feeTax, term);
    
    if (shortage.checked) {
        const shortageIn = parseInt(list.value);
        simulation = new FundingWShortage(mortage, entryValue, feeTax, term, shortageIn);
    }

    simulation.calculateMonthlyPayment();
    simulation.showInstallments();
});
