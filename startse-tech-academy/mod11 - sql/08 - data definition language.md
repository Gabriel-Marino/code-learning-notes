  * Data definition language (DDL)
    * set of commands to define and manage the DB schema
    * main commands: 
      * CREATE: used to create objects, like a database or a table
        * Example:
            ```sql
            CREATE DATABASE database_name;
            ```
        * Example:
            ```sql
            CREATE TABLE table_name (
                attribute_1 type <attribute_restrictions>,
                attribute_2 type <attribute_restrictions>,
                .
                .
                .
                attribute_n type <attribute_restrictions>,
                <table_restrictions>
            );
            ```
      * ALTER: used to modfiy existing objects
      * DROP: used to delete objects
      * TRUNCATE: used to delete all data from a table
    * Types:
      * String:
        * CHAR(size): Fixed size,  Maximum of 255 characters
        * VARCHAR(size): Variable string for the  Maximum of 65353 bytes
        * TINYTEXT(size):  Maximum size of 255 characters
        * TEXT(size):  Maximum size of 65353 bytes
        * MEDIUMTEXT(size):  Maximum size of 16777215 characters
        * LONGTEXT(size):  Maximum size of 4GB or 4294967295 characters
      * Number:
        * TINYINT: signed values in the range of -128 to 127, unsigned values in the range of 0 to 255
        * SMALLINT: signed range from -32768 to 32767, unsigned range from 0 to 65535
        * MEDIUMINT: signed range from -8388608 to 8388607, unsigned range from 0 to 16777215
        * INT: standard int used, signed range from -2147483648 to 2147483647, unsigned range from 0 to 4294967295
        * INTEGER: same as INT
        * BIGINT: signed range from -9223372036854775808 to 9223372036854775807, unsigned range from 0 to 18446744073709551615
        * FLOAT: single precision, 32-bit (7 significant digits)
        * DOUBLE: double precision, 64-bit (15 significant digits)
        * DECIMAL(size, precision): unpacked fixed poitn number, size is the total number of digits, precision is the number of digits after the decimal point, 128-bit (28 significant digits)
      * Date:
        * DATE: date in the format YYYY-MM-DD
        * DATETIME: date and time in the format YYYY-MM-DD HH:MM:SS
        * TIMESTAMP: same as DATETIME, but it's meant to be unique instead of DATETIME
        * TIME: time in the format HH:MM:SS
        * YEAR[2 | 4]: default is 4, 2 digits is for YY and 4 digits is for YYYY
      * Blob:
        * TINYBLOB: Maximum size of 255 bytes
        * BLOB: Maximum size of 65353 bytes
        * MEDIUMBLOB: Maximum size of 16777215 bytes
        * LONGTEXT: Maximum size of 4GB or 4294967295 characters
    * Attribute restrictions:
      * UNIQUE
      * NOT NULL
      * AUTO_INCREMENT
      * DEFAULT &lt;value&gt;
      * CHECK &lt;condition&gt;
    * Table restrictions:
      * PRIMARY KEY &lt;attribute_list&gt;
      * CHECK &lt;condition&gt;
      * UNIQUE &lt;attribute_list&gt;
      * FOREIGN KEY &lt;fk_attribute_list&gt; REFERENCES &lt;table_name&gt;(&lt;pk_attribute_list&gt;) &lt;condition&gt; &lt;action&gt;
        * condition: [ON DELETE | ON UPDATE] 
        * action: [CASCADE | RESTRICT | SET NULL | SET DEFAULT]
    * Example:
        ```sql
            CREATE DATABASE db_name;
            CREATE TABLE person (
                id INT UNIQUE AUTO_INCREMENT PRIMARY KEY,
                name VARCHAR(255) NOT NULL,
                birthdate DATE,
                job VARCHAR(255),
                PRIMARY KEY (id),
                CHECK (birthdate > CURRENT_DATE),
            );
        ```