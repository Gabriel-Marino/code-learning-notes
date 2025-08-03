Relational Model (RM) was created in 70's by Edgar F. Codd. And is near to real world.

Data sets:
* Entity and relations are called tables.
* Attributes are called columns or fields.

* **Operations** are fundamented on Set Theory and Algebra.
  * Projection, Cartesian Product, Selection, Union, Intersection, Difference, etc.

* Data organization
  * Tables, Columns, Relationships, keys, etc.

* Integrity:
  * Restrictions to data and relations.
  * Example: referential integrity and domain integrity.

* Manipulation:
  * Formal language (Algebra and Calculus) and SQL.

Organization:
* Domain
  * **set of atomic values** allowed to one side
  * types: string, number, etc
  * Examples:
    * id number
    * license number
    * name
    * birth date
* Attribute
  * Header of each column, type of the data.
  * Attribute are the concatenation of a name  with the domain, the domains are underlined.
  * Exampes:
    * id_number: <u>integer</u>
    * name: <u>char(20)</u>
    * birth_date: <u>date</u>
* Tuple
  * Set of pairs of attributes and values. Basically, a row.
  * define a occurence of a fact in the real world or the relation between facts.
  * Example:
    * person1: {(name, "Carlos"), (id_number, 1234567890), (birth_date, "1969-07-13")}
* Relation
  * Composed of a header and a body, the header are the set of attributes and the body is the set of tuples.
  * Header have a fixed number (relation level) of attributes and the attributes aren't ambiguous.
  * Body have a variable number (relation cardinality) of tuples and oreder is not important.
    * relation is basically a column of the table.
* Key
  * Superkey is the set of attributes which identify uniquely a tuple in a relation.
  * key is the superky with the lowest cardinality.
  * simple key is a tuple which can be indentify with a single key attribute.
  * composite key identify a tuple with more than one key attribute.
  * candidate key the possibility of exist more than one key in a relation.
  * primary key (PK) choosen among the candidate keys.
    * and is represented with the key name underlined.
    * any another candidate key is a secondary key.
  * Foregin key (FK) is an attribute from the relation R1 which contain an equivalency of value to a PK of a relation R2, should have the same domain (integrity restriction).

Relation schema:
* R(A1, A2, ..., An)
  * R is the name of the relation.
  * Ai is the name of the attribute.
  * n is the relation level.
  * Example:
    * person(<u>id_number</u>, name, birth_date)
