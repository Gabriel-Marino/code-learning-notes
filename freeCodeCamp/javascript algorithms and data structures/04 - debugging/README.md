## Debugging is the process of finding and fixing errors in a program. Exists three basic types of errors: Syntax, Logic, and Runtime.
#### A syntax error is when something was not written correctly, like calling a function or variable (transposed, missing or mis-capitalized character).
#### Logic errors are when the program doesn't output what was expected, like a program that could sum numbers but instead is subtracting.
### Runtime errors are when something goes wrong when running the program.

```JavaScript
/**
 * The most used "debugging" if could be called debugging, is the use of console.log() to print checkpoints throughout the code.
 * console.log() is a function that is used to print messages to the console.
 * So is possible to see a variable value or a function output before they're processed. So you can assure that they have the expected value.
 * In web development is common used the browser console to see the output of console.log(). Beside log(), console have a bunch of methods, like warn() and clear().
 */

/**
 * One good tool for debugging is the typeof operator, so you can see what type of variable is.
 * JavaScript have seven primitive types: number, string, boolean, null, undefined, symbol (ES6) and BigInt(ES2020). And one mutiple type: object.
 * This is good  for example to enforce the type of the input of a function.
 * For example you have a function which sums two numbers and if is passed a string ("7" instead of 7) it will concatenate the string with the number instead of summing.
 */

/**
 * Other common syntax errors are:
 * Characters which needed a closig pair, like parentheses, brackets, quotes, etc.
 * Missing or extra spaces.
 * Strings  can be written with single or double quotes and when the string have the need of use the single or double quote if you not mix or escape the quotes,
 * javascript will interpret the string in the wrong way.
 * Using the wrong operator, like in an if statement if you use the assignment ("=") operator instead of the equality ("==" or "===") operator, in almost all cases it
 * will be validated once almost everything in javascript evaluates to true, only falsy values will not be validated.
 * falsey values are: false, "" (empty string), NaN, undefined, null, 0 (number zero).
 */

// For example if you assin to a variable the return of a function, but forget the parentheses, you will pass the function instead of a value
const result = myFun; // This will pass the function myFun to the variable result. When you print the value of result you will get [Function: myFun] instead of a value

// Another common error is pass the values in the wrong order. "If the arguments are different types, such as a function expecting an array and an integer, this will likely throw a runtime error. If the arguments are the same type (all integers, for example), then the logic of the code won't make sense." quote from freeCodeCamp. 

// Another common error is the Off by one error or OBOE, they occur when you try to access a index out of the range of an array or string.

// Another one is when inside a loop a variable is not properly updated, if they're supposed to be reinitialized and aren't or vice-versa.

// Infinite loops are another common error, they occur when the condition of a loop is always true.

/**
 * 
 */
```