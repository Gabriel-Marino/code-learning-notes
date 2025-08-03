##

```JavaScript
/**
 * Sum All Numbers in a Range
 * 
 * We'll pass you an array of two numbers. Return the sum of those two numbers plus the sum of all the numbers between them.
 * The lowest number will not always come first.
 * 
 * For example, sumAll([4,1]) should return 10 because sum of all the numbers between 1 and 4 (both inclusive) is 10.
 */
function sumAll(arr)
{
    const arrCopy = arr.slice();
    const compareFunction = (a,b) => a - b;
    const arrSort = arrCopy.sort(compareFunction);
    const [first, last] = arrSort;
    const map2Index = (_, i) => i;
    const reduceSum = (acc, num) => acc + num;
    return new Array(last + 1).fill(1, first, last + 1)
                              .map(map2Index)
                              .reduce(reduceSum);
}

/**
 * Diff Two Arrays
 * 
 * Compare two arrays and return a new array with any items only found in one of the two given arrays, but not both.
 * In other words, return the symmetric difference of the two arrays.
 * 
 * Note: You can return the array with its elements in any order.
 */
function diffArray(arr1, arr2)
{
    const arr = [].concat(arr1).concat(arr2);
    const newArr = [];
    arr.sort().sort((a, b) => a - b);
    arr.map((item, index, arr) => {
        if (item !== arr[index + 1] && item !== arr[index - 1]) newArr.push(item);
    });
    return newArr;
}

/**
 * Seek and Destroy
 * 
 * You will be provided with an initial array (the first argument in the destroyer function), followed by one or more arguments.
 * Remove all elements from the initial array that are of the same value as these arguments.
 * 
 * Note: You have to use the arguments object.
 */
function destroyer(arr, ...args)
{
    const filter = arr.filter(item => !args.includes(item))
    return filter;
}

/**
 * Wherefore art thou
 * 
 * Make a function that looks through an array of objects (first argument) and returns an array of all objects that have matching name and value pairs (second argument). Each name and value pair of the source object has to be present in the object from the collection if it is to be included in the returned array.
 * 
 * For example, if the first argument is [{ first: "Romeo", last: "Montague" }, { first: "Mercutio", last: null }, { first: "Tybalt", last: "Capulet" }], and the second argument is { last: "Capulet" }, then you must return the third object from the array (the first argument), because it contains the name and its value, that was passed on as the second argument.
 */
function whatIsInAName(collection, source)
{
    const arr = [];
    // Only change code below this line
    const sourceKeys = Object.keys(source);
    const filterFunc = object => {
        const mapFunc = key => object.hasOwnProperty(key);
        return sourceKeys.map(mapFunc).every(val => val);
    };
    const possibleObjects = collection.filter(filterFunc);

    const mapFunc = obj => {
        const mapFunc = key => obj[key] === source[key];
        const condition = sourceKeys.map(mapFunc).every(val => val);
        if (condition) arr.push(obj);
    };
    possibleObjects.map(mapFunc);
    // Only change code above this line
    return arr;
}

/**
 * Spinal Tap Case
 * 
 * Convert a string to spinal case. Spinal case is all-lowercase-words-joined-by-dashes.
 */
function spinalCase(str)
{
    return str.replace(/\W|_|(?=[A-Z])/g, "-").replace(/--/g, "-").replace(/^-/, "").toLowerCase();
    // return str.split(/\W|_|(?=[A-Z])/g).join("-").toLowerCase();
}

/**
 * Pig Latin
 * 
 * Pig Latin is a way of altering English Words. The rules are as follows:
 * - If a word begins with a consonant, take the first consonant or consonant cluster, move it to the end of the word, and add ay to it.
 * - If a word begins with a vowel, just add way at the end.
 */
function translatePigLatin(str)
{
    const vowelRegExp = /^[aeiou]/gi;
    const consoRegExp = /^[bcdfghjklmnpqrstvwxyz]+/gi;
    const newStr = vowelRegExp.test(str) ?
        str + "way" :
        str.replace(consoRegExp, "") + str.match(consoRegExp) + "ay";
  return newStr;
}

/**
 * Search and Replace
 * 
 * Perform a search and replace on the sentence using the arguments provided and return the new sentence.
 * 
 * First argument is the sentence to perform the search and replace on.
 * Second argument is the word that you will be replacing (before).
 * Third argument is what you will be replacing the second argument with (after).
 * 
 * Note: Preserve the case of the first character in the original word when you are replacing it.
 * For example if you mean to replace the word Book with the word dog, it should be replaced as Dog
 */
function myReplace(str, before, after)
{
    const regexp = new RegExp(before);
    const newAfter = /^[A-Z]/.test(before) ?
        after[0].toUpperCase() + after.slice(1) :
        after.toLowerCase();
    return str.replace(regexp, newAfter);
}

/**
 * DNA Pairing
 * 
 * Pairs of DNA strands consist of nucleobase pairs. Base pairs are represented by the characters AT and CG, which form building blocks of the DNA double helix.
 * 
 * The DNA strand is missing the pairing element. Write a function to match the missing base pairs for the provided DNA strand.
 * For each character in the provided string, find the base pair character. Return the results as a 2d array.
 * 
 * For example, for the input GCG, return [["G", "C"], ["C","G"], ["G", "C"]]
 * 
 * The character and its pair are paired up in an array, and all the arrays are grouped into one encapsulating array.
 */
function pairElement(str)
{
    const bases = {
        "A": "T",
        "T": "A",
        "C": "G",
        "G": "C"
    };
    const input = str.split("");
    const output = input.map(base => [base, bases[base]]);
    return output;
}

/**
 * Missing letters
 * 
 * Find the missing letter in the passed letter range and return it.
 * 
 * If all letters are present in the range, return undefined.
 */
function fearNotLetter(str)
{
    const char2code = str.split("").map(char => char.charCodeAt());
    const missingCharIndex = char2code.map((_, i, arr) => Math.abs(arr[i] - arr[i-1])).indexOf(2);
    if (missingCharIndex < 0) return;
    const missingChar = String.fromCharCode(char2code[missingCharIndex - 1] + 1);
    return missingChar;
}

/**
 * Sorted Union
 * 
 * Write a function that takes two or more arrays and returns a new array of unique values in the order of the original provided arrays.
 * 
 * In other words, all values present from all arrays should be included in their original order, but with no duplicates in the final array.
 * 
 * The unique numbers should be sorted by their original order, but the final array should not be sorted in numerical order.
 * 
 * Check the assertion tests for examples.
 */
function uniteUnique(...arr)
{
    const newArr = [];
    arr.map(subarr =>
        subarr.map(item => {
            if (newArr.indexOf(item) < 0) newArr.push(item);
        })
    );
    return newArr;
}

/**
 * Convert HTML Entities
 * 
 * onvert the characters &, <, >, " (double quote), and ' (apostrophe), in a string to their corresponding HTML entities.
 */
function convertHTML(str)
{
    const entities = {
        "&": "&amp;",
        "<": "&lt;",
        ">": "&gt;",
        "\"": "&quot;",
        "\'": "&apos;",
    };
    const RegExp = /([&<>"'])/g;
    const charList = str.match(RegExp);
    if (!charList) return str;
    const newStr = str.split("")
                        .map(char => {
                            const ind = charList.indexOf(char);
                            if (ind < 0) return char;
                            return entities[char];
                        }).join("");
    return newStr;
}

/**
 * Sum All Odd Fibonacci Numbers
 * 
 * Given a positive integer num, return the sum of all odd Fibonacci numbers that are less than or equal to num.
 * 
 * The first two numbers in the Fibonacci sequence are 1 and 1. Every additional number in the sequence is the sum of the two previous numbers.
 * The first six numbers of the Fibonacci sequence are 1, 1, 2, 3, 5 and 8.
 * 
 * For example, sumFibs(10) should return 10 because all odd Fibonacci numbers less than or equal to 10 are 1, 1, 3, and 5.
 */
function sumFibs(num)
{
    const fibs = [0, 1];
    while (num >= fibs[fibs.length - 1]) fibs.push(fibs[fibs.length - 1] + fibs[fibs.length - 2]);
    const oddFibs = fibs.filter(fib => fib % 2 !== 0 && fib <= num);
    const sum = oddFibs.reduce((acc, num) => acc + num);
    return sum;
}

/**
 * Sum All Primes
 * 
 * A prime number is a whole number greater than 1 with exactly two divisors: 1 and itself.
 * For example, 2 is a prime number because it is only divisible by 1 and 2. In contrast, 4 is not prime since it is divisible by 1, 2 and 4.
 * 
 * Rewrite sumPrimes so it returns the sum of all prime numbers that are less than or equal to num.
 */
function sumPrimes(num)
{
    const isPrime = num => new Array(num).fill(0).map((_, i) => i+1).filter(div => num % div === 0).length === 2;
    const primesSum = new Array(num).fill(0).map((_, i) => i+1).filter(isPrime).reduce((acc, num) => acc + num);
    return primesSum;
}

/**
 * Smallest Common Multiple
 * 
 * Find the smallest common multiple of the provided parameters that can be evenly divided by both,
 * as well as by all sequential numbers in the range between these parameters.
 * 
 * The range will be an array of two numbers that will not necessarily be in numerical order.
 * 
 * For example, if given 1 and 3, find the smallest common multiple of both 1 and 3 that is also evenly divisible by all numbers between 1 and 3. 
 * The answer here would be 6.
 */
function smallestCommons(arr)
{
    const [lesser, bigger] = arr.slice().sort((a, b) => a - b);
    const [bigp1, map2index, notFalsy] = [bigger + 1, (_, i) => i, val => val];
    const range = new Array(bigp1).fill(0, lesser, bigp1).map(map2index).filter(notFalsy);

    // the following three lines are the solution from freeCodeCamp, i have been incapable of solving this by myself.
    const gcd = (a, b) => b === 0 ? a : gcd(b, a % b);
    const lcm = (a, b) => a * b / gcd(a, b);
    return range.reduce((acc, num) => lcm(acc, num));
    /**
     * moreover, i loved the way they writted the range like new Array(bigger - lesser + 1).fill(0).map((_, i) => i + lesser);
     * i tried once to write like that and won't worked :/
     */
}

/**
 * Drop it
 * 
 * Given the array arr, iterate through and remove each element starting from the first element (the 0 index)
 * until the function func returns true when the iterated element is passed through it.
 * 
 * Then return the rest of the array once the condition is satisfied, otherwise, arr should be returned as an empty array.
 */
function dropElements(arr, func)
{
    const newArr = arr.map(func);
    const index = newArr.indexOf(true);
    return index >= 0 ? arr.slice(index) : [];
}

/**
 * Steamroller
 * 
 * Flatten a nested array. You must account for varying levels of nesting.
 */
function steamrollArray(arr)
{
    const newArr = [];
    const flat = elem => Array.isArray(elem) ? elem.map(flat) : newArr.push(elem);
    arr.map(flat);
    return newArr;
}

/**
 * Binary Agents
 * 
 * Return an English translated sentence of the passed binary string.
 * 
 * The binary string will be space separated.
 */
function binaryAgent(str)
{
    return str.split(" ").map(binary => String.fromCharCode(parseInt(binary, 2))).join("");
}

/**
 * Everything Be True
 * 
 * Check if the predicate (second argument) is truthy on all elements of a collection (first argument).
 * 
 * In other words, you are given an array collection of objects. The predicate pre will be an object property and you need to return true if its value is truthy.
 * Otherwise, return false.
 * 
 * In JavaScript, truthy values are values that translate to true when evaluated in a Boolean context.
 * 
 * Remember, you can access object properties through either dot notation or [] notation.
 */
function truthCheck(collection, pre)
{
    return collection.map(obj => obj[pre]).every(val => val);
}

/**
 * Arguments Optional
 * 
 * Create a function that sums two arguments together. If only one argument is provided, then return a function that expects one argument and returns the sum.
 * 
 * For example, addTogether(2, 3) should return 5, and addTogether(2) should return a function.
 * Calling this returned function with a single argument will then return the sum:
 *      var sumTwoAnd = addTogether(2);
 * sumTwoAnd(3) returns 5.
 * 
 * If either argument isn't a valid number, return undefined.
 */
function addTogether(...args)
{
    if (!args.every(arg => typeof arg === "number")) return;
    const sum = (a, b) => {
        if (![a,b].every(arg => typeof arg === "number")) return;
        return a + b;
    };
    return args.length > 1 ? args.reduce(sum, 0) : num => sum(num, args[0]);
}

/**
 * ake a Person
 * 
 * Fill in the object constructor with the following methods below:
 *      getFirstName()
 *      getLastName()
 *      getFullName()
 *      setFirstName(first)
 *      setLastName(last)
 *      setFullName(firstAndLast)
 * 
 * Run the tests to see the expected output for each method. The methods that take an argument must accept only one argument and it has to be a string.
 * These methods must be the only available means of interacting with the object.
 */
const Person = function(firstAndLast)
{
    // Only change code below this line
    // Complete the method below and implement the others similarly
    this.getFullName = function() {
        return firstAndLast;
    };
    this.getFirstName = _ => {
        return firstAndLast.split(" ")[0];
    };
    this.getLastName = _ => {
        return firstAndLast.split(" ").slice(1).join("");
    };

    this.setFullName = name => firstAndLast = name;
    this.setFirstName = name => {
        const last = this.getLastName();
        firstAndLast = name +  " " + last;
    };
    this.setLastName = name => {
        const first = this.getFirstName();
        firstAndLast = first + " " + name;
    };

    return firstAndLast;
}

/**
 * Map the Debris
 * 
 * According to Kepler's Third Law, the orbital period T of two point masses orbiting each other in a circular or elliptic orbit is:
 *  T = 2 \pi \sqrt{\frac{a^{3}}{\mu}}
 *  a is the orbit's semi-major axis
 *  μ = GM is the standard gravitational parameter
 *  G is the gravitational constant,
 *  M is the mass of the more massive body.
 * 
 * Return a new array that transforms the elements' average altitude into their orbital periods (in seconds).
 * 
 * The array will contain objects in the format {name: 'name', avgAlt: avgAlt}.
 * 
 * The values should be rounded to the nearest whole number. The body being orbited is Earth.
 * 
 * The radius of the earth is 6367.4447 kilometers, and the GM value of earth is 398600.4418 km^3s^-2.
 */
function orbitalPeriod(arr)
{
    const GM = 398600.4418;
    const earthRadius = 6367.4447;
    const newArr = arr.map(obj => {
        const {name, avgAlt: alt} = obj;
        const orbitalPeriod = Math.round(2*Math.PI*(((earthRadius+alt)**3)/(GM))**(1/2));
        return {name, orbitalPeriod};
    });

    return newArr;
}
```