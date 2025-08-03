## Object Oriented Programming or OOP is one of the biggest paradigms used nowadays. OOP focuses on Objects and Classes which help abstract things from the real-worlds with ways to describe what they're and what they can do.
## Here is the basic of OOP in JavaScript, including the 'this' keyword, prototype chains, constructors, and inheritance.

```JavaScript
/**
 * Object are models to real-world things be they an animal, a vehicle, a store, anything.
 * Everything have their qualities, characteristics which define them, objects have properties which refer to the real-world qualities.
 * Similar objects have the same properties, but not always the same values, like every animal have legs, but each specie have a different number of legs.
 * To define an object you can use var, let or const and giving a name and then initializing with the curly brackets, inside the curly brackets each
 ** property-value pair is separated by commas and the pair is wrote like property: value, the value of the property can be anything, string, number, booleand, array,
 ** even another object and functions.
 * To retrive the value from a property inside an object you can use the dot notation, which is like obj_name.property. Is possible to modify the values too with
 ** the dot notation.
 * Functions inside objects are called methods, to create a method you can use the arrow notation or use the word function but without a name.
 * Inside the object you can use the keyword this to retrieve the value from a property insted of using the object name.
 * You can create a constructor method, so you can create new objects easily. Constructors are created using the keyword function and with capitalized names.
 * Then to instance the object you can use the keyword new with the constructor and pass to a variable.
 */

const obj_name = {
    property1: "sting",
    property2: 0000000,
    property3: [[],[]],
    property4: true,
    property5: {},
};

const prop = obj_name.property4; // prop will have the value of true
obj_name.property2 = 7;          // now the object is {property1: "sting", property2: 7, property3: [[],[]], property4: true, property5: {},}

const  my_methods = {
    method1: () => `do something`,
    method1: () => {return `something`;},
    method2: function() {return `something`;},
};

const person = {
    name: "",
    getName: () => `The person name is ${this.name}`,   /**
                                                         * this method return the string with the person name concatenated with "The person name" in ${this.name}
                                                         * you could use ${person.name} too, but if you change "person" to any other name, you would to updated
                                                         * your method, so with this the code is more reusable.
                                                         */
};

function MyConstructor(param1, param2)
{
    this.prop1 = param1;
    this.prop2 = param2;
}

const myObj1 = new MyConstructor("something", 42069);       // myObj will contain the object {prop1: "something", prop2: 42069}
const myObj2 = new MyConstructor("anything else", 1101);    // myObj will contain the object {prop1: "anything else", prop2: 1101}

/**
 * You can use instanceof to check if a given object was instantiated from a given constructor, like obj instanceof constructor, will return a boolean.
 * You can use the method  hasOwnProperty to check if an object have a given property, like obj.hasOwnProperty(prop) will return a boolean.
 * Sometimes when you want to define that all objects instantiated from a constructor have a property with the same value, like a car constructor and
 ** every car should have 4 wheels, so you create the property wheels and pass the value 4. But every time you instantiate a new object the object will
 ** do a copy of these property and if you create enough objects at some moment you will run out of space.
 * So instead create a copy of the property every time the an object is instantiated you can use the prototype keyword, inside the construtor you can do
 ** Constructor.prototype.prop = value, this will make to every object insatntiated from this constructor own the property but without doing a copy.
 * Different from the property defined with this the prototype property it's not a own property, because a own property the object will have a copy of.
 * You can use instead of instanceof the constructor method to get the constructor name of the object, like object.constructor will return a string.
 */

function Dog(name)
{
    this.name = name;
    this.legs = 4;
}

const bob = new Dog("Bob");
bob instanceof Dog;         // true
bob.hasOwnProperty(name);   // true

// refactoring the Dog constructor to use prototype
function Dog(name)
{
    this.name = name;           // own property, each object have a copy from.
    Dog.prototype.legs = 4;     // prototype property, every object share this property.
}

const steve = new Dog("Steve");
steve.constructor;              // Dog

/**
 *  Instead of adding each prototype property to a object inside the constructor you can use `constructor_name.prototype = {}` and define them all inside the
 ** curly brackets at once like if you was writing the object itself (but only with the prototypes).
 * It's important to rember to define the constructor in the prototype properties, because setting them manually will overwrite the constructor and lead to problems
 * Like you have inherited genes from you parents, an object inherit their prototype from the constrcutor which created them.
 ** To check this you can use `constructor_name.prototype.isPrototypeOf(obj_name)`, this function will return a boolean.
 * With a few exceptions, every object in JavaScript have a prototype, even an object prototype is an object, so even a prototype have a prototype.
 ** To check this you can use `Object.prototype.isPrototypeOf(constructor_name.prototype)`, this will return a boolean.
 * Object is a supertype for all objects in JavaScript, while the constructor is the supertype of the object he instantiate
 ** and the object is a butype of the constructor, because of this you create a prototype chain.
 */
// refactoring Dog
function Dog(name)
{
    this.name = name;
}
Dog.prototype = {
    constructor: Dog,   // definying the constrcutor in the prototype properties of Dog.
    legs: 4,
    getName: () => `The dog name is ${this.name}`,
}

const mike = new Dog("Mike");
Dog.prototype.isPrototypeOf(mike);              // true
Object.prototype.isPrototypeOf(Dog.prototype);  // true

/**
 * To follow the conduct of don't repeat yourself (DRY), you can create supertypes (or parents).
 * With the supertypes you can create inheritance from one object to another, this is good because instead of defining multiple times the same method
 ** you can do the definition one time, this is good because having something define mutipletimes lead to problems when is needed to modify one of them
 ** and forgeting to modify the others one.
 * For example you can reate a supertype named Animal which contain all habits shared though all animals, so when you create a constructor for a new a animal
 ** like, a bear, a bird or a dog, you will the habit already defined in Animal instead of need define them multiple times.
 * You can make an object inherit using `ChildObject.prototype = Object.create(ParentObject.prototype)` and then add the constructor and prototype properties
 ** using `ChildObject.prototype.property = propertyvalue`. 
 * Is possible to add a method to the child prototype which override the method inherited, just by using the same name as the method name in the parent.
 * When two unrelated object can do similiar things, like birds and planes can fly, but they're total unrelated, you can create a mixin function.
 * A mixin fuction let you to give same methods to unrelated object, so you don't need to repeat yourself.
 * By default all object properties are public, that is they can be write and read by any part of the code and this can lead to security problems.
 * You can use clousure to avoid this problem, that is defining the variable at the scope of the constructor, so they be enclosed by the constructor scope.
 * Using clousure is needed to define getters and setters, that is methods which can read and write the variable in sanitaized ways.
 * Sanitaized ways are ways to write and read data without leaving breach to fails.
 */

// Mixin Example
function NameMixin(object)
{
    object.methodName = (params) => {/*do something*/};
}

/**
 * Immediately Invoked Function Expression (IIFE) is a way to define an anonymous function which is executed as soon as possible.
 * IIFE pattern is wrote using two pairs of parenthesis, the first pair is where you derfine the function the second act like the parenthesis when calling a function.
 * IIFE functions don't need to have a name or beign stored in a variable.
 * You can use the IIFE pattern to wrap a group of related function into a single object or module. Like intead having multiple mixin you can have one mixin module.
 */

// IIFE pattern
(function () { /*do something*/ })()
(() => { /*do something*/ })()

// IIFE module
const mixinModule = (() => {
    return {
        mixinProp1: (obj) => {obj.prop1 = () => {/*do something*/}},
        mixinProp2: (obj) => {obj.prop2 = () => {/*do something*/}},
        mixinPropN: (obj) => {obj.propN = () => {/*do something*/}},
    };
})();
```