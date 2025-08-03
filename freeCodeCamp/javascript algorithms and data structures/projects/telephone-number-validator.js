/**
 * Telephone Number Validator
 * 
 * Return true if the passed string looks like a valid US phone number.
 * 
 * The user may fill out the form field any way they choose as long as it has the format of a valid US number.
 * The following are examples of valid formats for US numbers (refer to the tests below for other variants):
 * 
 *      555-555-5555
 *      (555)555-5555
 *      (555) 555-5555
 *      555 555 5555
 *      5555555555
 *      1 555 555 5555
 * 
 * For this challenge you will be presented with a string such as 800-692-7753 or 8oo-six427676;laskdjf.
 * Your job is to validate or reject the US phone number based on any combination of the formats provided above.
 * The area code is required. If the country code is provided, you must confirm that the country code is 1.
 * Return true if the string is a valid US phone number; otherwise return false.
 */

/**
 * Test if the passed number is a valid US phone number.
 * 
 * @param {string} number - The number to test.
 * @returns {boolean} True if the number is valid, false otherwise.
 */
function telephoneCheck(number)
{
    const validNumRegExp = /^\d{10,}|\d{3,} \d{3,} \d{4,}|\d{3,}(\s|-)\d{3,}(\s|-)\d{4,}|\(\d{3,}\)(\s|)\d{3,}-\d{4,}/;
    const validUScodeRegExp = /((^|\D)^[+]?1(\D|$))/;
    const checkClosingPair = string => string.replace(/\w|\s|-/g, "").length % 2 === 0;

    const num = number.replace(/\D/g, "").length <= 10 ? "1 ".concat(number) : number;

    return validNumRegExp.test(number) && validUScodeRegExp.test(num) && checkClosingPair(num);
}

// The key is the number to be tested and the value is the expected result.
const DATATEST = {
        "1 555-555-5555": true,
        "1 (555) 555-5555": true,
        "5555555555": true,
        "555-555-5555": true,
        "(555)555-5555": true,
        "1(555)555-5555": true,
        "555-5555": false,
        "5555555": false,
        "1 555)555-5555": false,
        "1 555 555 5555": true,
        "1 456 789 4444": true,
        "123**&!!asdf#": false,
        "55555555": false,
        "(6054756961)": false,
        "2 (757) 622-7382": false,
        "0 (757) 622-7382": false,
        "-1 (757) 622-7382": false,
        "2 757 622-7382": false,
        "10 (757) 622-7382": false,
        "27576227382": false,
        "(275)76227382": false,
        "2(757)6227382": false,
        "2(757)622-7382": false,
        "555)-555-5555": false,
        "(555-555-5555": false,
        "(555)5(55?)-5555": false,
        "55 55-55-555-5": false,
        "11 555-555-5555": false,
};

// every log should be true, testing if the return value is the expected value.
Object.keys(DATATEST).map(key => console.log(key, telephoneCheck(key) === DATATEST[key]));