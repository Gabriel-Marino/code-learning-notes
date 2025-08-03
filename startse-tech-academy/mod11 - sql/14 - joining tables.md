* you can retrive data which are related between tables
  * Exampe:
    ```sql
        SELECT
            attribute_list
        FROM
            table_name1, table_name2
        WHERE
            table_name1.key = table_name2.key;
    ```
  * You can use AS to create aliases
    ```sql
        SELECT
            attribute_list
        FROM
            table_name1 AS x, table_name2 AS y
        WHERE
            x.key = y.key;
    ```
* JOIN is a type of SQL query that joins two or more tables together. It's a horizontally operating query.
  * Example:
    ```sql
        SELECT
            attribute_list
        FROM
            table_name1
        JOIN
            table_name2  ON table_name1.key = table_name2.key;
    ```
    ```sql
        SELECT
            attribute_list
        FROM
            table_name1 AS x
        JOIN
            table_name2 AS y  ON x.key = y.key;
    ```
* UNION is a type of SQL query that combines the results of two or more queries. It's a vertically operating query.
  * Example:
    ```sql
        SELECT
            attribute1
        FROM
            table_name1
        [UNION | UNION ALL]
        SELECT
            attribute1
        FROM
            table_name2;
    ```