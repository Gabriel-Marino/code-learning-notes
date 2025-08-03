/**
 * Palindrome Checker
 * 
 * Return true if the given string is a palindrome. Otherwise, return false.
 * 
 * A palindrome is a word or sentence that's spelled the same way both forward and backward, ignoring punctuation, case, and spacing.
 * 
 * Note: You'll need to remove all non-alphanumeric characters (punctuation, spaces and symbols) and turn everything into the same case (lower or upper case) in order to check for palindromes.
 * 
 * We'll pass strings with varying formats, such as racecar, RaceCar, and race CAR among others.
 * 
 * We'll also pass strings with special symbols, such as 2A3*3a2, 2A3 3a2, and 2_A3*3#A2.
 */

/**
 * Return true if the word or phrase is a palindrome. A palindrome is a word or phrase that is the same forwards and backwards.
 * This function is not case sensitive and will ignore punctuation, spaces and symbols.
 * 
 * @param {string} word The word or phrase to check.
 * @returns {boolean} True if the word or phrase is a palindrome, false otherwise.
 */
function palindrome1(word) {
  const LOWERCASEWORD = word.toLowerCase();
  const ONLYALPHANUMEICCHAR = LOWERCASEWORD.replace(/[^a-z0-9]/gi, '');

  const REVERSEDWORD = ONLYALPHANUMEICCHAR.split("").reverse().join("");

  return ONLYALPHANUMEICCHAR === REVERSEDWORD;
}

/**
 * Return true if the word or phrase is a palindrome. A palindrome is a word or phrase that is the same forwards and backwards.
 * This function is not case sensitive and will ignore punctuation, spaces and symbols.
 * 
 * @param {string} word The word or phrase to check.
 * @returns {boolean} True if the word or phrase is a palindrome, false otherwise.
 */
function palindrome2(word) {
  const LOWERCASEWORD = word.toLowerCase();
  const LOWERCASELETTERS = LOWERCASEWORD.match(/[a-z0-9]/gi);

  const REVERSEDLETTERS = LOWERCASELETTERS.slice().reverse();

  const [WORD, REVERSEDWORD] = [LOWERCASELETTERS.join(""), REVERSEDLETTERS.join("")];

  return WORD === REVERSEDWORD;
}

const DATATEST = {
  "eye"                              : true,
  "_eye"                             : true,
  "race car"                         : true,
  "not a palindrome"                 : false,
  "A man, a plan, a canal. Panama"   : true,
  "never odd or even"                : true,
  "nope"                             : false,
  "almostomla"                       : false,
  "My age is 0, 0 si ega ym."        : true,
  "1 eye for of 1 eye."              : false,
  "0_0 (: /-\ :) 0-0"                : true,
  "five|\_/|four"                    : false,
}

Object.keys(DATATEST).map(key => console.log(key, palindrome1(key) === DATATEST[key]));
Object.keys(DATATEST).map(key => console.log(key, palindrome2(key) === DATATEST[key]));