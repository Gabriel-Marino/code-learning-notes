Aggregation functions:
* process the data from a collumn resulting in a single aggregate value
* Examples:
  * COUNT (column): number of rows in the table
  * MAX (column): maximum value in the column
  * MIN (column): minimum value in the column
  * SUM (column): sum of all values in the column
  * AVG (column): average of all values in the column
  * Example:
    ```sql
        SELECT
            <function>;(column)
        FROM
            <table>
        WHERE
            <condition>;
    ```
    ```sql
        SELECT
            COUNT(*)
        FROM
            table_1 a
        INNER JOIN
            table_2 b ON a.id = b.id
        WHERE
            a.id = 1;
        -- return how many instances of table_1 and table_2 have the id equal to 1
    ```

Sorting:
* Sort the tuples given some logical condition
* Examples:
  * ORDER BY column [ASC | DESC]: sort the tuples in ascending or descending order, ASC is default
    * Example:
      ```sql
        SELECT
            *
        FROM
            table_1 a
        INNER JOIN
            table_2 b ON a.id = b.id
        WHERE
            a.id = 1
        ORDER BY
            a.name DESC;
        -- return the tuples in descending order of the name column
      ```

Distinction:
* Select only the tuples with distinct values in the referenced columns
* Examples:
    ```sql
        SELECT DISTINCT
            column1, column2, ..., columnN
        FROM
            table_1, table_2, ..., tableN
        WHERE
            condition;
    ```
    ```sql
        SELECT DISTINCT
            a.id, b.id
        FROM
            table_1 a
        INNER JOIN
            table_2 b ON a.id = b.id
        WHERE
            a.id = 1;
        -- return the tuples with values which are distinct in the id columns of table_1 and table_2
    ```