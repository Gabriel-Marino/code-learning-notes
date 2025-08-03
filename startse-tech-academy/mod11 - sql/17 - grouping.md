Group:
* unify tuples with identical values, given the selected/grouped columns
* Examples:
```sql
    SELECT
        column_list
    FROM
        table_name
    WHERE
        condition
    GROUP BY
        group_list
    HAVING
        condition;
```
```sql
    SELECT
        a.id,
        a.name,
        MIN(a.mark),
        MAX(a.mark)
    FROM
        academics a
    INNER JOIN
        tests t ON a.id = t.id
    WHERE
        t.class_id = 1
    GROUP BY
        a.id,
        a.name
    HAVING
        AVG(a.mark) >= 7;
```