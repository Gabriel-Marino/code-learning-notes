## An algorithm is a "recipe" of how to do something. An efficient algorithm is made in smaller pieces, each solving a part of the problem.

```JavaScript
/**
 * Convert Celsius to Fahrenheit
 * 
 * The formula to convert from Celsius to Fahrenheit is the temperature in Celsius times 9/5, plus 32.
 * You are given a variable celsius representing a temperature in Celsius.
 * Use the variable fahrenheit already defined and assign it the Fahrenheit temperature equivalent to the given Celsius temperature.
 * Use the formula mentioned above to help convert the Celsius temperature to Fahrenheit.
 */
function convertCtoF(celsius)
{
    let fahrenheit = celsius * 9/5 + 32;
    return fahrenheit;
}

/**
 * Reverse a String
 * 
 * Reverse the provided string.
 * You may need to turn the string into an array before you can reverse it.
 * Your result must be a string.
 */
function reverseString(str)
{
    return str.split("").reverse().join("");
}

/**
 * Factorialize a Number
 * 
 * Return the factorial of the provided integer.
 * If the integer is represented with the letter n, a factorial is the product of all positive integers less than or equal to n.
 * Factorials are often represented with the shorthand notation n!
 * 
 * For example: 5! = 1 * 2 * 3 * 4 * 5 = 120
 * 
 * Only integers greater than or equal to zero will be supplied to the function.
 */
function factorialize(num)
{
    if (num < 0) return "Factorial operation is only applicable to positive integer numbers.";
    if (num <= 1) return 1;
    return new Array(num).fill(0).map((_, i)=> i+1).reduce((num, prod) => prod *= num);
}

/**
 * Find the Longest Word in a String
 * 
 * Return the length of the longest word in the provided sentence.
 * Your response should be a number.
 */
function findLongestWordLength(str)
{
    const biglen = str.split(" ")
                      .map((word) => {
                        return word.length;
                      })
                      .reduce((num, buf) => {
                        if (num > buf)
                        {
                            return num;
                        } else {
                            return buf;
                        }
                      });
    // return str.split(" ").filter(word => word.length === biglen).join(""); // this will return the rod with the biggest length;
    // return `biggest word: ${}, lenght: ${}.`
    return biglen;
}

/**
 * Return Largest Numbers in Arrays
 * 
 * Return an array consisting of the largest number from each provided sub-array.
 * For simplicity, the provided array will contain exactly 4 sub-arrays.
 * Remember, you can iterate through an array with a simple for loop, and access each member with array syntax arr[i].
 */
function largestOfFour(arr)
{
    return arr.map(subarr => subarr.reduce((num, buf) => {
        if (num > buf)
        {
            return num;
        } else {
            return buf;
        }
    }));
}

/**
 * Confirm the Ending
 * 
 * Check if a string (first argument, str) ends with the given target string (second argument, target).
 * This challenge can be solved with the .endsWith() method, which was introduced in ES2015.
 * But for the purpose of this challenge, we would like you to use one of the JavaScript substring methods instead.
 */
function confirmEnding(str, target)
{
    return new RegExp(target + '$').test(str);
}

/**
 * Repeat a String Repeat a String
 * 
 * Repeat a given string str (first argument) for num times (second argument).
 * Return an empty string if num is not a positive number.
 * For the purpose of this challenge, do not use the built-in .repeat() method.
 */
function repeatStringNumTimes(str, num)
{
    if (num < 0) return "";
    return new Array(num).fill(str).join("");
}

/**
 * Truncate a String
 * 
 * Truncate a string (first argument) if it is longer than the given maximum string length (second argument).
 * Return the truncated string with a ... ending.
 */
function truncateString(str, num)
{
    if (str.length > num) return str.split("")
                                    .filter((char, index) => {
                                        if (index < num) return char;
                                    })
                                    .join("") + "...";
    return str;
}

/**
 * Finders Keepers
 * 
 * Create a function that looks through an array arr and returns the first element in it that passes a 'truth test'.
 * This means that given an element x, the 'truth test' is passed if func(x) is true.
 * If no element passes the test, return undefined.
 */
function findElement(arr, func)
{
    let num = arr.filter(func)[0];
    return num;
}

/**
 * Boo who
 * 
 * Check if a value is classified as a boolean primitive. Return true or false.
 * Boolean primitives are true and false.
 */
function booWho(bool)
{
    return typeof bool === "boolean";
}

/**
 * Title Case a Sentence
 * 
 * Return the provided string with the first letter of each word capitalized.
 * Make sure the rest of the word is in lower case.
 * For the purpose of this exercise, you should also capitalize connecting words like the and of.
 */
function titleCase(str)
{
    return str.toLowerCase().split(" ")
                            .map(word => {
                                const [firstLetter, ...wordRemainder] = word.split("");
                                return firstLetter.toUpperCase() + wordRemainder.join("");
                            })
                            .join(" ");
}

/**
 * Slice and Splice
 * 
 * You are given two arrays and an index.
 * Copy each element of the first array into the second array, in order.
 * Begin inserting elements at index n of the second array.
 * Return the resulting array. The input arrays should remain the same after the function runs.
 */
function frankenSplice(arr1, arr2, n)
{
    const arr = arr2.slice();
    arr.splice(n, 0, ...arr1);  // a note for myself here, splice return nothing, he only modifies the array, it's an impure function.
    return arr;
}

/**
 * Falsy Bouncer
 * 
 * Remove all falsy values from an array.
 * Falsy values in JavaScript are false, null, 0, "", undefined, and NaN.
 * Hint: Try converting each value to a Boolean.
 */
function bouncer(arr)
{
    return arr.filter(val => val);
}

/**
 * Where do I Belong
 * 
 * Return the lowest index at which a value (second argument) should be inserted into an array (first argument) once it has been sorted.
 * The returned value should be a number.
 * 
 * For example, getIndexToIns([1,2,3,4], 1.5) should return 1 because it is greater than 1 (index 0), but less than 2 (index 1).
 * 
 * Likewise, getIndexToIns([20,3,5], 19) should return 2 because once the array has been sorted it will look like [3,5,20]
 * and 19 is less than 20 (index 2) and greater than 5 (index 1).
 */
function getIndexToIns(arr, num)
{
    const copy = arr.slice();
    copy.push(num);
    copy.sort((a,b) => a - b);
    return copy.indexOf(num);
}


/**
 * Mutations
 * 
 * Return true if the string in the first element of the array contains all of the letters of the string in the second element of the array.
 * For example, ["hello", "Hello"], should return true because all of the letters in the second string are present in the first, ignoring case.
 * The arguments ["hello", "hey"] should return false because the string hello does not contain a y.
 * Lastly, ["Alien", "line"], should return true because all of the letters in line are present in Alien.
 */
function mutation(arr)
{
    const word0 = arr[0].toLowerCase().split("");
    const word1 = arr[1].toLowerCase().split("");
    return word1.filter(letter1 => word0.filter(letter0 => letter0 === letter1).length).join("") === word1.join("");
}

/**
 * Chunky Monkey
 * 
 * Write a function that splits an array (first argument) into groups the length of size (second argument) and returns them as a two-dimensional array.
 */
function chunkArrayInGroups(arr, size)
{
    return new Array(Math.ceil(arr.length/size)).fill(0).map(item => arr.splice(0, size));
}
```