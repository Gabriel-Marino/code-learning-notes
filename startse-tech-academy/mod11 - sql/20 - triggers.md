Triggers are used to modify the behavior of the database given a condition, they can intercept some actions and change how they act on the database.

To create a trigger you can do the following:
```sql
DELIMITER $

CREATE TRIGGER trigger_name [BEFORE | AFTER] [INSERT | UPDATE | DELETE] ON table_name FOR EACH ROW
BEGIN
    IF [NEW | OLD].attribute condition THEN
        -- CODE TO BE EXECUTED WHEN THE TRIGGER IS FIRED
    END IF;
END$

DELIMITER;
```

```sql
DELIMITER $

CREATE TRIGGER refuse_new_user BEFORE INSERT ON users FOR EACH ROW
BEGIN
    IF NEW.usernmae IS NOT NULL THEN
        SIGNAL SQLSTATE '45000' SET MESSAGE_TEXT = 'Is not porssible to register a new user.';
    END IF;
END$

DELIMITER;

-- this trigger will be fired when is tried to insert a new user, and will reject the insertion and print the message text
```
```sql
    DELIMITER $

    CREATE TRIGGER insert_after_on_table_2 AFTER INSERT ON table_1 FOR EACH ROW
    BEGIN
        IF NEW.id IS NOT NULL THEN
            INSERT INTO table_2(id, attribute1, attributeN)
                VALUES(NEW.id, value1, valueN);
        END IF;
    END$

    DELIMITER;
```