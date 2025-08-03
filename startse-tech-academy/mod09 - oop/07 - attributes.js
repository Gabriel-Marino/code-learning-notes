"use strict";

class ClassName
{
	// An attribute can't bre accesed outside of the class he is declared
	// It's not mandatory declare the attribute before the construcotr,
	// but its the most common practice
	attribute1;
	.
	.
	.
	attributeN;
	// All classes need a constructor method, otherwise JS will create an empty cosntructor.
	// constrcutor method is used to initiate the attributes of the object
	// he is automatically called when instantiating an object
	constructor (attribute1, ..., attributeN)
	{
		// this is a word reserved by JS, this reffer to an object created by this class
		// is used to differ tattributes of the object from the variables of a method
		this.attribute1 = attribute1;
		.
		.
		.
		this.attributeN = attributeN;
	}
}
