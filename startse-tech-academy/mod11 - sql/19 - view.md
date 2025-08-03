A view is a shortcut to retrieve data from a table. You can create a view using the CREATE VIEW statement before making a query.
Example:
```sql
    CREATE VIEW view_name AS
    SELECT
        column_list
    FROM
        table_1
    INNER JOIN
        table_2 ON table_1.key = table_2.key
    INNER JOIN
        table_N ON table_N.key = table_1.key
    GROUP BY
        group_list
    HAVING
        condition;
```
And then use like
```sql
    SELECT * FROM view_name WHERE condition;
```
