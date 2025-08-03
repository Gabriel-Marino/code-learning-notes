## Data can be stored in many ways, some of them are arrays and objects. Here you'll find when is best to use one or another type and some helpful methods to manipulate data.

```JavaScript
/**
 * The simplest implementation of a data structure is an array, array can store another arrays, numbers, strings, booleans and objects.
 * The simplest array is an one-dimensional array, which means that is not a nested array (array stored inside array generate a nested array).
 * One method applied to arrays is the length method, which return the array size
 */

// to declare an array you can use var, let or const with a variable name and brackets, like
let my_arr = [];            // this is an empty array
let len = my_arr.length;    // using the length method to get the array size, as my_arr beign empty then len will be zero.

// a multidimensional array, is an array which contain another array, like
let multi = [
        [0, 1],
        [true, false],
        ["", "a"],
        [undefined, null],
        [
            {one: 1, two: 2},
            {a: "a", b: "b"}
        ]
    ];

/**
 * Beside store data, is fundamental be capable of retrieve the data from a data structure.
 * To retrieve the data from an array, you can use the bracket notation, which means witre the name of the array follow by brackets with the index of the
 * element you want to retrieve inside the brackets.
 * It's important to notice that in JavaScript the indexes begin at zero, so the first element is the element in the index zero.
 * Is possible too to use the bracket notation to modify the element of an array.
*/

// storing the numbers in the range of 1 to 9 in the array numbers
let  numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9];
// retrieving the first element of the array numbers
let first = numbers[0];     // first is equal to one
// modifying the element in the index 3
numbers[3] = "not 4 anymore";    // now numbers will be [1, 2, 3, "not 4 anymore", 5, 6, 7, 8, 9]

/**
 * Arrays are mutable, that is it's can contain any type and the type can be mixed - the same array can contain string, number, boolean and objects.
 * Elements can be added or removed at the time too, and beside the bracket notation exists the push and unshift methods.
 * .push will add the elements at the end of the array, while .unshift will add at the beginning, and both of them can receive multiple arguments.
 * push and unshift have almost practically opposite methods pop and shift. .pop will remove and return the last item of the array, while .shift will
 * do the same with the fist item.
 */

let letters = ['a', 'b', 'c'];
letters.unshift(1, 2, 3);               // letters becomes [1, 2, 3, 'a', 'b', 'c']
letters.push(true, undefined, false)    // letters becomes [1, 2, 3, 'a', 'b', 'c', true, undefined, false]
let first = letters.shift();            // first will be equal to 1 and letters becomes [2, 3, 'a', 'b', 'c', true, undefined, false]
let last = letters.pop();               // last will be equal to false and letters becomes [2, 3, 'a', 'b', 'c', true, undefined]

/**
 * Another method to moidy arrays is splice, splice take uo to three arguments, thr first is the index where it will begin to replace the items,
 * the second is optional and is how many items will be replaced, the third where the items to replace and it's optional too. So with you use
 * splice with one or two arguments then will only remove the items from the array, if you use splice with only one argument you will remove
 * every element beginning in the given index to the end of the array.
 */

let alphabet = ['a', 'b', 'c', 'd', 'e'];
alphabet.splice(1, 2, "2", "3")     // alphabet becomes ['a', '2', '3', 'd', 'e']
alphabet.splice(1, 2)               // alphabet becomes ['a', 'd', 'e']
alphabet.splice(0)                  // alphabet becomes an empty array

const numbers = [1, 2, 3, 9, 10, 11];
const another = [4, 5, 6];
numbers.splice(3, another.length, ...another);  // numbers becomes [1, 2, 3, 4, 5, 6]
// you could pass 0 in the second argument to only add the another list elements inside the numbers array, like
numbers.splice(3, 0, ...another);               // numbers becomes [1, 2, 3, 4, 5, 6, 9, 10, 11]

/**
 * Besides modifying, you can duplicate an array with the slice method, which create a new array exactly equal to the original, but the original you remain untouched.
 * slice can receive up to two arguments, both are optional, or you can specify them to duplicate only a specific range of the array intead of the whole array.
 * Only thing to have caution with the slice method is that slice don't copy the item in the index where he should stop, like if you call .slice(2, 4) he will
 * only copy the items in the idex 2 and 3.
 * If you want to copie the full array withou modifying the original one, you can use the spread operator (the three periods before the array name) inside brackets.
 * The spread operator is a good way to concatenate arrays too, you can use the spread operator in any position inside the array to add every item from another
 * array beginning in that position.
 */

let arr1 = [0, 1, 2 , 3, 4];
let arr2 = arr1.slice(1,4);     // arr2 will be [1, 2, 3]
let arr3 = arr1.slice();        // arr3 will be [0, 1, 2, 3, 4]
let arr4 = [...arr1];           // arr4 wiil be [0, 1, 2, 3, 4], using the spread operator inside brackets give the same result as using .slice()

let alph1 = ['b', 'c', 'd', 'e', 'f', 'g'];
// using the spread operator to concatenate arrays is like
let alph2 = ['a', ...alph1, 'h', 'i', 'j', 'k', 'l', 'm'];  // alph2 will be equal to ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm']

/**
 * Arrays beign mutable create a problem of not knowning where a piece of data is, to circumvent this you can use the method indexOf.
 * If the argument passed to indexOf not exists in the list the method return -1, otherwise return the index of the argument.
 */

let numbers = [-5, -4, -3, -2, -1, 1, 2, 3, 4, 5];
numbers.inexOf(0);      // will return -1, because doesn't exists the number 0 in the array numbers
numbers.inexOf(1);      // will return 5
numbers.inexOf(-3);     // will return 2

/**
 * Beside the methods like map, filter, forEach, every, etc; in the most cases the easeast way to iterate over an array is using the for loop.
 * About multi-dimensonal arrays, teoracally you can create infinite nested arrays, and for each level of deepness inside the nested arrays you
 * can add a new pair of brackets in the bracket notation to retrieve the data from the nbested arrays. like arr = [[[[2]]]] arr[0][0][0][0] will be 2
 */

/**
 * In principle, objects are collections of key-values pairs, that is they are piece of data (values) mapped to properties (keys).
 * You can create an object using var, let or const with a name and the passing the key-lavue pair inside a curly brackets to the object name.
 * You can retrieve the data from the object using the dot or bracket method, like object_name.key or object_name[key], some times the key is
 * a number, so the dot notation won't work, bracket notation will be necessary too if the key have a space character or if you want to pass a
 * variable to the object key.
 * You can use the bracket and dot notation to modify the data inside the object, even add data to the object.
 * Objects can store anything, strings, numbers, arrays, another objects, even functions.
 * You can remove any propertie from an object using delete, like delete my_obj.key;
 * Is possible to verify if the property exists in the object using the hasOwnProperty method or with in, like my_obj.hasOwnProperty(key) or key in my_obj;
 * To loop over an object you can use ForIn, which will return all keys from the object, like for (let varname in my_obj), varname will contain the key;
 * You can user Object.keys(my_obj) to return an array will all propertys in an object
 */

let my_obj = {
    bool: true,
    str: "string",
    arr: [],
    num: 1,
    obj: {
        key1: "value",
        key2: 2,
    },
    fun(param1, param2) {
        let var1, var2;
        return var1 + param1 + var2 + param2;
    }
};

my_obj.num;     // return the value in the propertie num, which is 1
my_obj[str];    // return the value in the propertie str, which is "string"
my_obj["name"] = "namename";    // add the propertie name to the object with the value "namename"
my_obj.age = 00;                // add the propetie age to the object with the value 00;

const players = {
    id: "0x0001",
    date: "2022-07-13",
    data: {
        total: 110,
        online: 72,
        status: {
            active: 56,
            busy: 6,
            afk: 10,
        },
    },
};

players.data.status.busy;       /**
                                 * return the value of the propertie busy in the object status inside the object data inside the players, which is 6,
                                 * you can do the same to modify the data inside the nested object players.
                                 */
players.data["status"].budy;    // will do the same as the above line, you can mix the dot and bracket notation;
"id" in players;                // return true
players.hasOwnProperty("date"); // return true
```