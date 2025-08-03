#### A static attribute is one which only can be accessed by the class which he belongs to.
#### A static attribute can't be accessed by object or subclasses

#### To declare a static attribute it's just needed to use the reserved word "static" before the attribute name

```JavaScript

class ClassName
{
	staic attr1 = val1;
	attr2;
	constructor (attr2)
	
		this.attr2 = atrr2;
	}
}

const obj = new ClassName(val);
console.log(obj.attr1);		// undefined
console.log(ClassName.attr1);	// val1
```
