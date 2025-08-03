A subquery is a query used to select data from another query, and it's like
```sql
SELECT * FROM (
    SELECT
        column_list
    FROM
        table_1
    INNER JOIN
        table_N
    WHERE
        condition;
) AS alias
WHERE
    condition;
```

```sql
    SELECT
        column_list,
        (
            SELECT
                column_list
            FROM
                table_2
            WHERE
                condition
        ) AS alias
    FROM
        table_1
    WHERE
        condition;
```
it's not recommended to use subquerys given the complexity, they can easily lead to misconceptions.