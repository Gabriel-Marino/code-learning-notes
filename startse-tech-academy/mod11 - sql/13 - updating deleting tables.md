* Data manipulation language (DML)
  * Query, insertion, update and deletion of DB instances
  * main commands:
    * INSERT: used to add tuples to a table
      * Example:
        ```sql
            INSERT INTO table_name (attribute1, attribute2, ..., attributeN)
                VALUES (value1, value2, ..., valueN);
        ```
    * SELECT: used to retrieve tuples from a table, instead of a list of attributes you can * to retrieve all attributes
      * Example:
        ```sql
            SELECT attribute1, attribute2, ..., attributeN
                FROM table_name
                WHERE condition;
        ```
      * Some operators:
        * [= (equal) | <> (not equal) | < (lesser than) | <= (lesser than or equal) | > (greater than) | >= (greater than or equal)]: used to compare values
        * [AND | OR | NOT]: used to combine conditions
        * IN: checks if a value is in a list of values
        * BETWEEN:, check if a value is between two other values, used with dates
        * IS NULL: check if a value is null
        * LIKE: used to check if a value is similar to another value, like a regular expression, % is used to match any character before or after the value
          * Example:
            ```sql
                SELECT *
                    FROM people
                    WHERE name LIKE '%doe%'; -- returns all people with a name containing 'doe'
            ```
            ```sql
                SELECT *
                    FROM people
                    WHERE name LIKE '%doe%' AND birth_date BETWEEN '1990-01-01' and '2000-12-31';
                    -- returns all people with a name containing 'doe' and a birth date between 1990-01-01 and 2000-12-31
            ```
            ```sql
                SELECT *
                    FROM people
                    WHERE name LIKE '%doe%' OR birth_date BETWEEN '1990-01-01' and '2000-12-31';
                    -- returns all people with a name containing 'doe' or a birth date between 1990-01-01 and 2000-12-31
            ```
    * UPDATE: used to update a tuple in a table
      * Example:
        ```sql
            UPDATE table_name
                SET attribute1 = value1, attribute2 = value2, ..., attributeN = valueN
                WHERE condition;
        ```
    * DELETE: used to remove a tuple from a table
      * Example:
        ```sql
            DELETE FROM table_name
                WHERE condition;
        ```