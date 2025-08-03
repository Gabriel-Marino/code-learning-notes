The enrity-relationship model (ERM) was created by Peter Chen in 1979.

ERM is a concept to describe the object(entity) from a business, with their own attributes and how they are related to each other. Is an abstraction of the database.

ERD (Entity Relationship Diagram) is a diagram that shows the relationship between the objects and their attributes.

---

Entity:
* Are objects from the real world. And can be:
  * Physical: real life objects, like: people, cars, houses, etc.
  * Conceptual: concepts given the interaction of physical objects, like: buy, sell, rent, etc.
* In ERD each entity is represented by a rectangle.

---

Relationship:
* Relations which exists in the real world
  * like: a student attends a discipline.
* Allow to understand how an entity is related to each other.
* In ERD each relationship is represented by a diamond.

---

Attribute:
* Values which represents properties of an entity or relationship.
  * entity attributes: name, age, etc.
  * relationship attributes: price, distance, etc.
* In ERD each attribute is represented by an ellipse.
* Classification:
  * Descriptive: intrisic characteristics
  * Nominatives: beside beign descriptives, they can define and identify the entity.
  * References: represent the link between the entity and attribute.
* Types:
  * simple: atomic, can't be divided, like a name or id number.
  * composite: can be divided into subattributes, like an address.
  * single-valued: get only one value for the entity or relationship.
  * multi-valued: can get more than one value.
    * in ERD multi-valued attributes are represented by two concentric ellipses.
  * stored: owned by the entity or relationship.
  * derived: can be calculated from other attributes.
  * key:
    * unique: entity should have at least one attribute to uniquely identify it.
    * main, but not only, to consult the entity logs.
    * In ERD is a underlined attribute.
* An attribute of a relantionship can modify the relantionship and can't be applied to the entity.
  * Like if the student was approved in the discipline he attends. The attribute approved is from the releationship and not from the student or the discipline.

---

Roles in the relationship:
* Each entity in ERM have a role
* Indicate the role in ERD is not mandatory, but can be useful to understand the relationship.
  * It's most reommended to use when coulda happen an ambiguity in the relationship.
* When an entity has more than one role, the roles can be separated by a comma or use one line per role to connect entity to the relationship.