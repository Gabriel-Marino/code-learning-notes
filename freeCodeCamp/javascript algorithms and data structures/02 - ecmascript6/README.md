## ECMAScript or ES is the standardized version of JavaScript. All modern browsers follow the ECMAScript standard. JS and ES are interchangeable. Almost everything in the basic module is from ES5 which was finalized in 2009. ES6 was released in 2015 and comes with many powerful features. ES5 still works, but ES6 is more modern.

```JavaScript
/**
 * Again, this is a comment.
 * And it can be multiline.
 * Or it can be singleline using //.
 * The var problemn is that var defines a variable globally, while let defines a variable locally. And this can lead to errors.
 */

for (var i = 0; i < 10; i++)
{
    console.log(i);
}               // This will print 0 to 9.
console.log(i); // This will print 10.
/**
 * This happen because var being global, it can be accessed outside the for loop. And the loop only printed while the condition was true,
 * but after that the i was incremented and this value could be accessed.
 * to avoid this, use let.
 */

for (let i = 0; i < 10; i++)
{
    console.log(i);
}               // This will print 0 to 9.
console.log(i); // This will print undefined. Because i is only defined inside the for loop.

/**
 * About the const:
 * const declare a constant, but arrays, objects, and functions still can be mutated. const only prevents reassignment of the identifier.
 * To prevent reassignment, you can use Object.freeze() to freeze the object.
 */

const NUMS = [1, 2, 3, 4, 5];
NUMS.push(6);                   // This will work.
NUMS = [2, 4, 6, 8, 10, 12];    // This will throw an error.
NUMS[0] = 20;                   // This will work.
Object.freeze(NUMS);            // This will freeze the array.
NUMS[0] = 30;                   // This will throw an error.

/**
 * When you need a function which will be passed to another function or which will be not used again, you can use the function expression.
 * A function expression can be defined anonymously or using arrow function.
 * If the function can be written in a single line, you can discard the curly braces.
 */

const myFun = function(param1, param2) {
    // anonymous function
    // function body
}

const myFun = (param1, param2) => {
    // arrow function
    // function body
}

const myFun = () => new Date();

// in ES6 is possible to use default parameters.
const increment = (number, value = 1) => number += value; // if value is not defined, it will be 1.

/**
 * Rest parameters, in order to create more flexible functions, ES6 introduced the rest parameter.
 * Which is ... follow by the name of the parameter. Thiw parametes will work like an array.
 * So is possible to pass as many parameters as you want. And in the function treat them as elements of an array.
 */

const myFun = (...args) => {
    // function using the rest parameter
    // the first argument is args[0], the second is args[1], etc.
    // function body
}

const sum = (...args) => args.reduce((a, b) => a + b, 0);

/**
 * Spread operator, introduced in the ES6, is used to spread an array into a function.
 * When a function expect multiple arguments, you can use the spread operator to pass an array as a single argument.
 * The spread operator is ... followed by the name of the array.
 */

const NUMBERS = [7, 69, 42, -1, 42069, -42069, 2, 27, 72];
const MAX = Math.max(...NUMBERS);   // This will return 42069. The spread operator spreads the array into a single argument.
let arr = [...NUMBERS];             // The spread operator return an unpacked array. He only work in an argument to a function or in an array liteal.
let spread = [..NUMBERS]            // This will throw an error.

/**
 * Destructuring, introduced in the ES6, is used to extract data from an object.
 * Is possible to assign the values to variables with the same name as the properties of the object, or to new variables.
 * To assign to new variables, you write the property name followed by a colon and the new variable name.
 * Is possible to use destructuring with nested objects.
 * Is possible to use destructuring with arrays. Different from the spread operator, you can choose what values to extract and can to assign to variables.
 * While spread will return a list or unpacked array, the destructuring will return the value from the exact position.
 * And you can use any number of commas to select the values you want.
 * Is possible to combine destructuring with the rest operator, so while some elements are assign to variables the rest will be returned as an array.
 * Is possible to use destructuring as parameters in functions, so you can pass an object as a parameter and extract the values you need.
 */

const person = {
    name: "",
    age: 00,
    address: {
        street: "",
        city: ""
    }
}

// without destructuring
const name = person.name;
const age = person.age;

// with destructuring
const {name, age} = person;
// with destructuring and new variables
const {name: personName, age: personAge} = person;
// with destructuring and nested objects
const { address: {street: personStreet, city: personCity}} = person;

// destructuring arrays
const [x, y, z] = [0, 1, 2, 3, 4, 5, 6, 7, 8 , 9];          // assign x = 0, y = 1, z = 2.
const [x,,, y,,,,,, z] = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];    // assign x = 0, y = 3, z = 9.
const [,,x,,, y,,,,, z] = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];   // assign x = 2, y = 5, z = 9.
const [,,x,,, y,,,,,,, z] = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]; // assign x = 2, y = 5, z is undefined.
const [x, y,, z, ...arr] = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9];  // assign x = 0, y = 1, z = 3, arr = [4, 5, 6, 7, 8, 9].

// function with destructuring as parameters
const myFun = ({name, age}) => console.log(name, age);

/**
 * Template literals, introduced in the ES6, are used to create strings with variables.
 * The string can be created using the backtick (`) character.
 * Is used ${} to insert the value of a variable in the string. And it's called interpolation.
 * With interpolation you can insert anything in the string, including functions.
 */

// using destructuring and template literals
const myFun = ({ name, age }) => console.log(`Hello ${name}, you are ${age} years old.`);

/**
 * Object literals, introduced in the ES6, are used to create objects more easily.
 * Before the ES6 was needed to declare the keyword and variable containing the value to pass to the key word
 * Now is possible to assign values to properties using the same name as the property.
 */

// without object literals
const createPerson = (name, age) => ({
    name: name,
    age: age,
});
// with object literals
const createPerson = (name, age) => ({
    name,
    age,
});

/**
 * Before ES6 when declaring a function within the object was needed to declare anonymously the function.
 * Now is possible to declare the function inside the object and assign it to a property.
 */

// without declarative functions
const calc = {
    add: function(a, b) {
        return a + b;
    },
    sub: function(a, b) {
        return a - b;
    },
};
// with declarative functions
const calc = {
    add(a, b) {
        return a + b;
    },
    sub(a, b) {
        return a - b;
    },
    sub(a, b) {
        return a - b;
    },
};

/**
 * In ES6 was introduced the class keyword. and the class is a blueprint for an object.
 * Before ES6 objects were only objects literals, now isn't a full abstraction, but is a step in this direction.
 * When declaring a class, you need to declare the name of the class and the constructor.
 * A class is an abstraction of an element of the real world, a class contains the properties which is common through objects of that type and methods
 * which can modify the properties and state of the object.
 * Is a common and good practice to user UpperCamelCase for the class name and lowerCamelCase for the properties and methods. 
 */

// class declaration
class Person
{
    constructor(name, age)
    {
        this.name = name;
        this.age = age;
    }

    sayHello()
    {
        console.log(`Hello ${this.name}, you are ${this.age} years old.`);
    }
}
// object instantiation
const person = new Person("John", 30);

/**
 * Getters and Setters
 * Is a common practice encapsulate the properties of an object. So the properties are private and can't be accessed directly.
 * So to read the properties is needed the getter and to modify them is needed the setter.
 * To declare a private attribute you need to declare them using # before the name. And is a common practice to use the underscore at the beging of private attributes.
 */

// here the attributes are privates without getters and setters
class PersonPrivate
{
    #_name;
    #_age;
    constructor(name, age)
    {
        this.#_name = name;
        this.#_age = age;
    }

    sayHello()
    {
        console.log(`Hello ${this.#_name}, you are ${this.#_age} years old.`);
    }
}

// here the attributes are privates with getters and setters
class PersonPrivate2
{
    #_name;
    #_age;
    constructor(name, age)
    {
        this.#_name = name;
        this.#_age = age;
    }

    get name()
    {
        return this.#_name;
    }
    get age()
    {
        return this.#_age;
    }
    set name(name)
    {
        this.#_name = name;
    }
    set age(age)
    {
        this.#_age = age;
    }
    sayHello()
    {
        console.log(`Hello ${this.#_name}, you are ${this.#_age} years old.`);
    }
}

const Pedro = new Person("Pedro", 25);
const Carlos = new PersonPrivate("Carlos", 30);
const Maria = new PersonPrivate2("Maria", 20);

console.log(Carlos._name);      // undefined
console.log(Carlos.#_name);     // throw an error, because the attribute is private
Carlos.#_name = "Carlos João";  // throw an error, because the attribute is private
console.log(Pedro.name);        // Pedro
Pedro.name = "John Gabriel";    // Pedro is now John Gabriel
console.log(Pedro.name);        // John Gabriel
console.log(Pedro.age);         // 25
console.log(Maria._name);       // undefined
console.log(Maria.#_name);      // throw an error, because the attribute is private
console.log(Maria.name);        // Maria
Maria.name = "Maria Antonia";   // Set the name of Maria to Maria Antonia
console.log(Maria.name);        // Maria Antonia

/**
 * Modules
 * To share code between files, is necessary to use modules. To create a module is necessary to use the keyword export.
 * And to use the module is necessary to use the keyword import at the file where you want to use the module.
 * Is possible to export using the export keyword before each variable or function declaration.
 * Or to use export {} with the names of the variables or functions to export.
 * And to import the module is necessary to use the keyword import at the file where you want to use the module, but indicating where the module is.
 * import { name } from 'module.js'; or import * as alias from 'module.js' to import all the variables or functions of the module.
 * As fallback precaucion is recommended to use the export default. export default only work with functions.
 * To import the export default is only need to call import name from 'module.js'; without the curly brackets.
 */

export default function add(a, b) {
    return a + b;
}

export function add(a, b) {
    return a + b;
}
function sub(a, b) {
    return a - b;
}
export function mul(a, b) {
    return a * b;
}

function add(a, b) {
    return a + b;
}
function sub(a, b) {
    return a - b;
}
function mul(a, b) {
    return a * b;
}
export { add, mul };

/**
 * Promises
 * Is a common pattern to handle asynchronous operations. A promise is a constructor function so is needed to use new keyword to create one.
 * A Promise could either fulfill the promise or fail to do so.
 * A promise is always declared with the parameters resolve and reject, they're methods to determine the outcome of the promise.
 * Asyncronous operations are the one which not follow a order of execution. Usually they're executed in parallel and originate from requests out of the place where the code is executed.
 * if the promise is resolved is used the method then to handle the outcome of the promise. Otherwise is used the catch method.
 */

const myPromise = new Promise((resolve, reject) => {
    // do something
    if (condition) {
        resolve(value);
    } else {
        reject(error);
    }
});

myPromise.then(value => {
    // do something
});

myPromise.catch(error => {
    // do something
});

// is possible to do promise, then and catch in the same line, like
const myPromise = new Promise((resolve, reject) => {
    // do something
    if (condition) {
        resolve(value);
    } else {
        reject(error);
    }
}).then(value => {
    // do something
}).catch(error => {
    // do something
});
```