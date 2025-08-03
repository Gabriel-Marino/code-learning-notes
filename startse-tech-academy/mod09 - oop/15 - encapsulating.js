"use strict";

// encapsulating is the practice of protecting and hiding attributes, so the data contained in them only can be only accessed and modified by the methods in the class. One way of encapsulate is turn the attribute privates. In JS a attribute is declared private when declared with # at the begging of the attribute name.
// Is possible in the same way to apply this to methods

class ClassName
{
	#attributePrivate;
	attributePublice;
	constructor(attr1, attr2)
	{
		this.#attributePrivate = attr1;
		this.attributePublic = attr2;
	}

	getPrivate()
	{
		return this.#attributePrivate;
	}

	#privateMethod()
	{
		return "something";
	}
}

const obj = new ClassName('value1', 'value2');
console.log(obj.attributePrivate);	// error
console.log(obj.getPrivate);		// value1
console.log(obj.privateMethod());	// error
console.log(ClassName.privateMethod());	// something
