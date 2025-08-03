CREATE DATABASE university;

CREATE TABLE academic (
    academic_id INTEGER NOT NULL,
    academic_name VARCHAR(255) NOT NULL,
    birth_date DATE NOT NULL CHECK (birth_date >= REPLACE(convert(CHAR(10), DATEADD(YEAR, -18, CURRENT_DATE), 126), '-', '')),
    PRIMARY KEY (academic_id),
    UNIQUE (academic_id),
);

CREATE TABLE discipline (
    discipline_id INTEGER NOT NULL,
    discipline_name VARCHAR(255) NOT NULL,
    credits INTEGER DEFAULT 0,
    PRIMARY KEY (discipline_id),
);

CREATE TABLE academic_discipline (
    academic_id INTEGER,
    discipline_id INTEGER,
    year YEAR CHECK (year >= REPLACE(convert(CHAR(10), YEAR, 126), '-', '')),
    semester INTEGER CHECK (semester IN(1,2)),
    mark DECIMAL(4,2) DEFAULT 0,
    PRIMARY KEY (academic_id, discipline_id, year, semester),
    FOREIGN KEY (academic_id) REFERENCES academic (academic_id) ON DELETE RESTRICT,
    FOREIGN KEY (discipline_id) REFERENCES discipline (discipline_id) ON DELETE RESTRICT,
);

