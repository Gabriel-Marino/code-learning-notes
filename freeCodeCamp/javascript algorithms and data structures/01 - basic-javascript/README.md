## JavaScript is a scripting language that can be used to write programs that run in a web browser. With CSS and HTML, JavaScript is one of the core technologies used to build web applications. And here are the basics.

```JavaScript

// this is a comment
/**
 * multi
 * line
 * comment
 */

// to declare a variable
var varname;

// assigning a value to the var
varname = 0;

// declaring and assigning variable
var varname2 = 0;

// is possible to assign the value from one variable to another
varname = varname2;

// string variable
var string = "string";

// is recommended to use camelCase when declaring variables, so the variable with multiple words can be more readble
var camelCase;
var notcamelcase;

// is recommended to use let instead of var, because var can lead to some errors
let varName;

// the last reserved word to declare a "variable" is const, which declare a constant, is recommended to use only upercase to const
const CONSTNAME;

/**
 * basic operator, arithmetic operators
 * + (addition)
 * - (subtraction)
 * * (multiplication)
 * / (division)
 * % (modulo, give the remainder of the division)
 * ** (power)
 */

/**
 * to sum one to a variable use varName++
 * to subtract one from a variable use varName--
 * to sum x to a variable use varName += x
 * to subtract x from a variable use varName -= x
 * to multiply a variable by x use varName *= x
 * to divide a variable by x use varName *= x
 * same work with power and modulo
 */

// to create a double quote use \ to let the quotation mark escape
let doubleQuoted = "I am a \"double quoted\" string"
// is possible to use apostrophe instead the quotation marks to avoid using backlash
let doubleQuoted = 'I am a "double quoted" string'

/**
 * Escape sequences
 * \' single quote
 * \" double quote
 * \\ backlash
 * \n new line
 * \r carriage return
 * \t tab
 * \b word boundary
 * \f form feed
 */

// + is used to to concatenate strings
let str1 = "First" + "Second"       // becomes "FirstSecond"
let str2 = "First" + " " + "Second" // becomes "First Second"
str2 += " Third"                    // becomes "First Second Third"
let str3 = "Count: " + str2 + "."   // becomes "Count: First Second Third."

// to check the length of the string use .length
let str3Length = str3.length;

/**
 * is possible to select a single character from a string using [] with the index of the char,
 * the first char will have the index of 0 and the last one will have index of the length - 1
 * the string is immutable, so the character cannot be changed, to change one char is needed
 * rewrite the string with the new character
 */

// array is a list of things, to create an array use [], and can contain multiple types even an array
const MYARR = ["string", 1, true, ["1", 1]];

// and like to the string is possible to use [] to select an element and .length to get the size of the array
const SOMETHING = MYARR[MYARR.length - 2];

// but different from the string, the array is mutable, so the element can be changed
MYARR[0] = "new string";    // becomes ["new string", 1, true, ["1", 1]]

// for array of arrays is used [][] to acess the elements
const NUMBERS = [[1, 2, 3], [4, 5, 6], [7, 8, 9]];
NUMBERS[2][0] // 7

// to add an element to the end of the array use .push
NUMBERS.push([10, 11, 12]); // becomes [[1, 2, 3], [4, 5, 6], [7, 8, 9], [10, 11, 12]]

// to remove an element from the end of the array use .pop
NUMBERS.pop(); // becomes [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
// pop returns the element removed, so it can be assigned to a variable

// to remove an element from the beginning of the array use .shift
NUMBERS.shift(); // becomes [[4, 5, 6], [7, 8, 9]]
// shift returns the element removed, so it can be assigned to a variable

// to add an element to the beginning of the array use .unshift
NUMBERS.unshift([0, 1, 2]); // becomes [[0, 1, 2], [4, 5, 6], [7, 8, 9]]

/**
 * suggested by github copilot, not in the course
 * to remove an element from the middle of the array use .splice with the index of the element and the number of elements to remove
 * to add an element to the middle of the array use .splice with the index of the element and the number of elements to add and the elements to add
*/

// to createn reusable code create a function, functions are declared with the function keyword, and can be called with the function name
function myFunction()
{
    // function body
}
myFunction(); // call the function

// is possible to pass arguments to the function, to do this declare the parameters within ()
function myFunction(parameter1, parameter2)
{
    // function body
    console.log(parameter1, parameter2);    // prints the parameters
    console.log(parameter1 + parameter2);   // prints the sum of the parameters
}
myFunction(1, 2); // prints 1 2 in the first line and 3 in the second line

/**
 * Exists two types of scope: global and local
 * Global scope is the scope of the whole program, it is the scope of the variables and functions declared outside of any function
 * Local scope is the scope of the function, it is the scope of the variables and functions declared inside of a function
 * Any variable or function declared outside of a function is global, any variable or function declared inside of a function is local
 * Global variables can be accessed/changed by any function, local variables can be accessed/changed only by the function where they were declared
 * one problem with var is that when a variable is declared with var, it is global, so it can be accessed/changed by any function, but when it is declared with let, it is local, so it can be accessed/changed only by the function where it was declared
 * is possible to create functions which modify global variables and return nothing
 */

/**
 * if is a conditional statement, it is used to execute different code depending on the condition
 * == is the equality operator, it checks if the values are equal
 * === is the strict equality operator, it checks if the values are equal and the same type
 * != is the inequality operator, it checks if the values are not equal
 * !== is the strict inequality operator, it checks if the values are not equal and the same type
 * > is the greater than operator, it checks if the first value is greater than the second value
 * >= is the greater than or equal to operator, it checks if the value is greater than or equal to the other value
 * < is the less than operator, it checks if the first value is less than the second value
 * <= is the less than or equal to operator, it checks if the value is less than or equal to the other value
 * && is the logical and operator, it checks if both conditions are true
 * || is the logical or operator, it checks if at least one condition is true
 * else is used to execute code if the condition is false
 * else if is used to execute code if the condition is false and another condition is true
 * switch is used to execute different code depending on the value of a variable
 */

if (condition)
{
    // code to execute if the condition is true
} else if (condition2) {
    // code to execute if the condition is false and another condition is true
} else {
    // code to execute if the condition is false
}

if (condition && condition2)
{
    // code to execute if both conditions are true
}

if (condition || condition2)
{
    // code to execute if at least one condition is true
}

switch (variable)
{
    case value1:
        // code to execute if the value of the variable is value1
        break;
    case value2:
        // code to execute if the value of the variable is value2
        break;
    default:
        // code to execute if the value of the variable is not value1 or value2
        break;
}

switch (variable)
{
    case value1:
    case value2:
    case value3:
        // code to execute if the value of the variable is value1, value2 or value3
        break;
    case value4:
    case value5:
    case value6:
        // code to execute if the value of the variable is value4, value5 or value6
        break;
    default:
        // code to execute if the value of the variable is not value1, value2, value3 or value4, value5 or value6
        break;
}

// is possible directly the test of conditions
function isLessThan(a, b)
{
    return a < b;
}

// is possible to exit the function with undefined if one of the value of the paramaters is not acceptable for the function
function squareRoot(a)
{
    if (a < 0)
    {
        return undefined; // or even an empty return, just the return keyword
    }
    return Math.sqrt(a);
}

/**
 * Objects are used to store data in a structured way, they are used to store data in a way that is easy to access, and that is easy to modify
 * They work like arrays, but they uses keywords instead of indexes and they are more flexible, they can store data in different ways, and they can store functions
 * You can declare an object with {} or with new Object()
 * You can access the properties of an object with ., and you can access the values of the properties with []
 * Objects are mutable, they can be changed, and they can be added to
 * You can delete a property of an object with delete object.property
 * You can create a new property of an object with object.property = value or object[property] = value
 * You can check if a property exists with object.hasOwnProperty(property), if exists return true otherwise return false
 * You can nest objects, objects can be nested inside other objects and arrays
 */

const myObj = {
    "string": "string",
    number: 1,
    boolean: true,
    array: [1, 2, 3],
    function: duplicate(num)
    {
        return num * 2;
    }
};
myObj.string;           // "string"
myObj.number;           // 1
myObj["boolean"];       // true
myObj["array"][0];      // 1
myObj["duplicate"](2);  // 4

delete myObj.number;    // deletes the number property of the object

const myObj2 = new Object();
myObj2.string = "string";
myObj2["number"] = 1;

/**
 * Loops are used to execute a block of code a number of times
 * While is used to execute a block of code while a condition is true
 * Do while is used to execute a block of code at least once, and then check the condition again
 * For is used to execute a block of code for a number of times, and then check the condition again
 * For in is used to execute a block of code for each property of an object, and then check the condition again
 * For of is used to execute a block of code for each value of an array, and then check the condition again
 * For each is used to execute a block of code for each value of an array, and then check the condition again
 * for (let x in arr) x will be the index, and for (let x of arr) x will be the value
 */

const numbers = [];
let i = 10;

while (i > 0)
{
    numbers.push(i);
    i--;
} // numbers becomes [10, 9, 8, 7, 6, 5, 4, 3, 2, 1]

for (i = 0; i < numbers.length; i++)
{
    numbers.pop();
} // numbers becomes []

for (let index = 0; index < 10; index++)
{
    if (index % 2 === 0)
    {
        numbers.push(index);
    }
} // numbers becomes [0, 2, 4, 6, 8]

for (let number in numbers)
{
    console.log(number);
} // prints 0, 2, 4, 6, 8

numbers.forEach(number => 2 * number); // numbers becomes [0, 4, 8, 12, 16]

for (let number of numbers)
{
    numbers.pop();
} // numbers becomes []

for (let index = 11; index > 0; index -= 2)
{
    numbers.push(index);
} // numbers becomes [11, 9, 7, 5, 3, 1]

/**
 * Recursion is a way to execute a function recursively, it is used to execute a function a number of times, and then call itself again
 * Recursion is used to avoid the use of loops, it is used to avoid the use of stack overflow errors
 */

function factorial(num)
{
    let product = 1;
    while (num > 0)
    {
        product *= num;
        num--;
    }
    return product;
} // return the factorial of the number using while loop

function factorial(num)
{
    if (num === 0)
    {
        return 1;
    }
    return num * factorial(num - 1);
} // return the factorial of the number using recursion

/**
 * Math is a built-in object that contains methods for mathematical constants and functions
 * Math.PI is the value of pi
 * Math.E is the value of e
 * Math.random() returns a random number between 0 and 1
 * Math.floor(x) returns the largest integer less than or equal to x
 * And a lot of other methods
 */

function randomNumber(min, max)
{
    return Math.floor(Math.random() * (max - min + 1)) + min;
} // returns a random number between min and max

/**
 * To convert a number to a string, you can use the toString() method
 * To convert a string to a number, you can use the parseInt() method or the parseFloat() method
 * parseInt() have two arguments, the first is the string to convert, and the second is the radix, which is the base of the number system, by default it is 10 and is a number between 2 and 36
 * The only argument in toString() is the radix, which is the base of the number system, by default it is 10 and is a number between 2 and 36
 */

function convertToBinary(num)
{
    return num.toString(2);
} // returns the binary representation of the number

function convertFromBinary(num)
{
    return parseInt(num, 2);
} // returns the number in decimal base from the binary base

// Ternary operator is a shortcut to write if-else statements
const result = condition ? ifTrue : ifFalse;

// is possible to nest ternary operators
const result2 = condition1 ? ifTrue1 : condition2 ? ifTrue2 : ifFalse;
```