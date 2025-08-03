mapping between schemas

* ERM is a concept model
* Relational model is an implementation model

* Mapping is translate the concept into an implementation, that is turn the ERM into a relational model.

* Real World &rarr; Requirement analysis &rarr; ERM &rarr; relational model &rarr; database
  * Real World, Requirement's and ERM are independent of the DBMS
  * relational model and database are dependent of the DBMS

* Composite attributes aren't implemented, instead the subattributes are implemented
  * Example: in the ERM exists an attribute address composed of street, city, state, country, then is implemented street, city, state, country instead of address

* Cardinality:
  * oneToOne:
    * Add the PK of the entity 1 in the entity 2 and viceversa
  * oneToMany:
    * E1 will be only represented with attributes of E1
    * E2 will be represented:
      * E2 attributes
      * PK of E1 (FK)
      * relations attributes
  * manyToMany:
    * E1 will be only represented with attributes of E1
    * E2 will be only represented with attributes of E2
    * Will be created a third table Er with the relations between E1 and E2, which will be represented by:
      * PK of E1 (FK)
      * PK of E2 (FK)
      * relations attributes
      * PK of Er is the sum of the PKs of E1 and E2
      * it's recommended to name Er with the names of E1 and E2 concatenated and separated by an underscore
