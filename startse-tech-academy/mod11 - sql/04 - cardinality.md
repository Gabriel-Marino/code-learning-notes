Cardinality is the number (minimum and/or maximum) of entities a entity can relate to.

In ERD cardinality is represented by a pair of numbers inside parentheses above the the line connecting the entities.

Minimum cardinality:
* minimum number of times of occurences which an entity is related to occurences of the other entity.
* Specify if the occurences between entities are mandatory or not.
  * 0 the occurences are optional.
  * 1 or above, the occurences are mandatory.

Maximum cardinality:
* maximum number of times of occurences which an entity is related to occurences of the other entity.
* cardinality 1 means thats exists a unique relation between the entities.
* cardinality N (capital n) means that have how many relations between the entities which is necessary to have.

Combinations:
* (1,1) - oneToOne
  * Means that an entity in set A is related to a maximum of one entity in set B. And an entity in set B is related to a maximum of one entity in set A.
* (1,N) - oneToMany
  * Means that an entity in set A is related to any number of entities in set B. And an entity in set B is related to a maximum of one entity in set A.
* (N,1) - manyToOne
  * Means that an entity in set is related to a maximum of one entity in set B. And an entity in set B is related to any number of entities in set A.
* (N,N) - manyToMany
  * Means that an entity in set is related to any number of entities in set B. And an entity in set B is related to any number of entities in set A.