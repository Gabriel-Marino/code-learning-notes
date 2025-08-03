/**
 * Cash Register
 * 
 * Design a cash register drawer function checkCashRegister() that accepts purchase price as the first argument (price), payment as the second argument (cash),
 * and cash-in-drawer (cid) as the third argument.
 * 
 * cid is a 2D array listing available currency.
 * 
 * The checkCashRegister() function should always return an object with a status key and a change key.
 * 
 * Return {status: "INSUFFICIENT_FUNDS", change: []} if cash-in-drawer is less than the change due, or if you cannot return the exact change.
 * 
 * Return {status: "CLOSED", change: [...]} with cash-in-drawer as the value for the key change if it is equal to the change due.
 * 
 * Otherwise, return {status: "OPEN", change: [...]}, with the change due in coins and bills, sorted in highest to lowest order, as the value of the change key.
 */

/**
 * Check if in the cash register there is enough money for give the correct change, and the status of the register.
 * The change is returned in the form of an array with the currency and the amount of each currency in highest to lowest order.
 * The status of the register can be:
 * - INSUFFICIENT_FUNDS - if the cash-in-drawer is less than the change due.
 * - CLOSED - if the cash-in-drawer is equal to the change due.
 * - OPEN - if the cash-in-drawer is greater than the change due.
 * 
 * @param {number} price - the price of the item.
 * @param {number} cash - the amount of cash provided.
 * @param {Array.<Array.<sitrng, number>} cid - the cash in drawer.
 * @returns {object} - the status and change.
 */
function checkCashRegister(price, cash, cid)
{
    let [cidSlice, changeVal] = [cid.map(sub => [...sub]), cash - price];
    const [cidAmount, changeValue, change, currencyUnits, stats] = [
        cidSlice.reduce((acc, key) => acc + key[1], 0),
        cash - price,
        [],
        {
            "ONE HUNDRED": 100,
            "TWENTY": 20,
            "TEN": 10,
            "FIVE": 5,
            "ONE": 1,
            "QUARTER": 0.25,
            "DIME": 0.1,
            "NICKEL": 0.05,
            "PENNY": 0.01
        },
        ["INSUFFICIENT_FUNDS", "CLOSED", "OPEN"]
    ];

    Object.keys(currencyUnits).map(key => {
        const value = currencyUnits[key];
        while (changeVal >= value) {
            changeVal = Number(changeVal.toFixed(2));
            const changeIndex = change.findIndex(currency => currency[0] === key);
            const cidSliIndex = cidSlice.findIndex(currency => currency[0] === key);
            if (cidSlice[cidSliIndex][1] <= 0) break;
            changeVal -= value;
            changeIndex === -1 ?
                change.push([key, value]) :
                change[changeIndex][1] += value;
            cidSlice[cidSliIndex][1] -= value;
        }
    });
    change.map(key => key[1] = Number(key[1].toFixed(2)));
    const countHowMany = (arr, obj) => arr.map(key => {
        const currency = key[0];
        const unit = obj[currency];
        const amount = Math.ceil(key[1] / unit);
        return [currency, amount]
    });
    const cidHowMany = countHowMany(cidSlice, currencyUnits);
    const changeHowMany = countHowMany(change, currencyUnits);
    const cond = changeHowMany.every(val => val[1] > cidHowMany[cidHowMany.findIndex(key => key[0] === val[0])][1]);

    return  changeValue ===  cidAmount          ? { status: stats[1], change: cid } :
            changeValue >    cidAmount || cond  ? { status: stats[0], change: [ ] } :
            { status: stats[2], change };
}