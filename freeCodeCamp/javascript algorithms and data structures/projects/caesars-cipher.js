/**
 * Caesars Cipher
 * 
 * One of the simplest and most widely known ciphers is a Caesar cipher, also known as a shift cipher.
 * In a shift cipher the meanings of the letters are shifted by some set amount.
 * 
 * A common modern use is the ROT13 cipher, where the values of the letters are shifted by 13 places. Thus A ↔ N, B ↔ O and so on.
 * 
 * Write a function which takes a ROT13 encoded string as input and returns a decoded string.
 * 
 * All letters will be uppercase. Do not transform any non-alphabetic character (i.e. spaces, punctuation), but do pass them on.
 */

/**
 * Convert a ROT13 encoded string to a decoded string or a decoded string to a ROT13 encoded string.
 * ROT13 is a simple letter substitution cipher that replaces a letter with the letter 13 letters after it in the alphabet.
 * 
 * @param {string} str The ROT13 encoded string.
 * @returns {string} The decoded string.
 */
function rot13(str)
{
  const isLowerCase = char => char === char.toLowerCase();
  const input = str.split("");
  let output = "";
  input.map(letter => {
    const alphanumRegExp = /\w/;
    const k = isLowerCase(letter) ? 97 : 65;
    const code = letter.charCodeAt() - k;
    const ROT13 = (code + 13) % 26;
    if (alphanumRegExp.test(letter)) {
      output += String.fromCharCode(ROT13 + k);
    } else {
      output += letter;
    }
  });

  return output;
}