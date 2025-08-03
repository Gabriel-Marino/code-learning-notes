JOIN TYPES:
* INNER JOIN: only the intersection of the tables is returned, only the rows that have matching keys.
* LEFT JOIN: return all rows from the left table and only the rows from the right table that have matching keys.
* RIGHT JOIN: return all rows from the right table and only the rows fromt the left table that have matching keys.
* FULL JOIN: return all rows from the both tables.


<table>
<tr>
<th>Table P</th>
<th>Table O</th>
</tr>

<tr>
<td>

| A | B | C |
|---|---|---|
| 2 | 2 | b |
| 3 | 2 | c |
| 5 | 2 | e |
| 7 | 2 | g |

</td>
<td>

| A | D | E |
|---|---|---|
| 1 | 1 | a |
| 3 | 2 | c |
| 5 | 2 | e |
| 7 | 2 | g |
| 9 | 3 | i |

</td>
</tr>
</table>
<table>
<tr>
<th>P INNER JOIN O</th>
<th>P LEFT JOIN O</th>
<th>P RIGHT JOIN O</th>
<th>P FULL JOIN O</th>
</tr>

<tr>
<td>

| R.A | S.A | B | C | D | E |
|---|---|---|---|---|---|
| 3 | 3 | 2 | c | 2 | c |
| 5 | 5 | 2 | e | 2 | e |
| 7 | 7 | 2 | g | 2 | g |

</td>
<td>

| R.A | S.A | B | C | D | E |
|---|---|---|---|---|---|
| 2 | null | 2 | b | null | null |
| 3 | 3 | 2 | c | 2 | c |
| 5 | 5 | 2 | e | 2 | e |
| 7 | 7 | 2 | g | 2 | g |

</td>
<td>

| R.A | S.A | B | C | D | E |
|---|---|---|---|---|---|
| null | 1 | null | null | 1 | a |
| 3 | 3 | 2 | c | 2 | c |
| 5 | 5 | 2 | e | 2 | e |
| 7 | 7 | 2 | g | 2 | g |
| null | 9 | null | null | 3 | i |

</td>
<td>

| R.A | S.A | B | C | D | E |
|---|---|---|---|---|---|
| null | 1 | null | null | 1 | a |
| 2 | null | 2 | b | null | null |
| 3 | 3 | 2 | c | 2 | c |
| 5 | 5 | 2 | e | 2 | e |
| 7 | 7 | 2 | g | 2 | g |
| null | 9 | null | null | 3 | i |

</td>
</tr>
</table>


