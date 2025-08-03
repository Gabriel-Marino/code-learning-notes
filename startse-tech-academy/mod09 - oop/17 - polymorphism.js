"use strict";

class SuperName
{
	#attr1;
	#attr2;
	constructor(attr1, attr2)
	{
		this.#attr1 = attr1;
		this.#attr2 = attr2;
	}


	method1()
	{
		return `${this.#attr1}, ${this.#attr2}`;
	}
}

class SubName extends  SuperName
{
	#attr3;
	#attr4;
	constructor(attr1, attr2, attr3, attr3)
	{
		super(attr1, attr2);
		this.#attr3 = attr3;
		this.#attr4 = attr4;
	}

	// overwrite the method from the superclass, creating a polymorphism
	method1()
	{
		// as this method being defined in the super and subclass, so is needed to use super intead os this when calling the method from the super otherwise will create an infinite loop and throw overflow
		return `${super.method1()}, ${this.#attr3}, ${this.#attr4}`;
	}
}
