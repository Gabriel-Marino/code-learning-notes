/**
 * Roman Numeral Converter
 * 
 * Convert the given number into a roman numeral.
 * 
 * All roman numerals answers should be provided in upper-case.
 */

/**
 * Convert an integer to a Roman numeral.
 * 
 * @param {number|string} num The integer to convert.
 * @returns {string} The Roman numeral.
 */
function convertToRoman(num)
{
  const romans = {
    "M": 1000,
    "CM": 900,
    "D": 500,
    "CD": 400,
    "C": 100,
    "XC": 90,
    "L": 50,
    "XL": 40,
    "X": 10,
    "IX": 9,
    "V": 5,
    "IV": 4,
    "I": 1,
  };

  let [input, output] = [Number(num), ""];
  const romanNumbers = Object.keys(romans);
  romanNumbers.map(num => {
    const val = romans[num];
    while (input >= val)
    {
      input -= val;
      output += num;
    }
  });

  return output;
}