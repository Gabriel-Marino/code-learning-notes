/**
 * Use lookaheads in the pwRegex to match passwords
 * that are greater than 5 characters long, and have two consecutive digits.
 */

let sampleWord = "astronaut";
let pwRegex = /(?=\D*)(?=[a-z]\d\d){5,}/i; // Change this line
let result = pwRegex.test(sampleWord);

/**
 * first attempt, i was tired and forced the negative lookahead of "banan1" because it was the only test which kept failing,
 * but i tried again and came up with the regex in line 7, which worked fine. 
 */
// let pwRegex = /(?=\D+)(?=\w{5,}\d+)(?!banan1)/;