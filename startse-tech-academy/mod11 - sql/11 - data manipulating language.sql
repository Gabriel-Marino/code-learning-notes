CREATE DATABASE IF NOT EXISTS university;
USE university;

CREATE TABLE IF NOT EXISTS academic (
    academic_id INTEGER UNIQUE NOT NULL,
    academic_name VARCHAR(255) NOT NULL,
    academic_email VARCHAR(255) UNIQUE NOT NULL,
    birth_date DATE NOT NULL,
    PRIMARY KEY (academic_id)
    -- UNIQUE (academic_id, academic_email),
    -- CHECK (birth_date >= REPLACE(convert(CHAR(10), DATEADD(YEAR, INTERVAL -18 YEAR), 126), '-', ''))
);

CREATE TABLE IF NOT EXISTS discipline (
    discipline_id INTEGER NOT NULL,
    discipline_name VARCHAR(255) NOT NULL,
    credits INTEGER DEFAULT 0,
    PRIMARY KEY (discipline_id)
);

CREATE TABLE IF NOT EXISTS academic_discipline (
    academic_id INTEGER,
    discipline_id INTEGER,
    occurr_year YEAR(4),
    semester INTEGER CHECK (semester IN(1,2)),
    mark DECIMAL(4,2) DEFAULT 0,
	-- CHECK (year >= REPLACE(convert(CHAR(10), YEAR, 126), '-', '')),
    PRIMARY KEY (academic_id, discipline_id, occurr_year, semester),
    FOREIGN KEY (academic_id) REFERENCES academic (academic_id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (discipline_id) REFERENCES discipline (discipline_id) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS professor (
    professor_id INTEGER NOT NULL,
    professor_name VARCHAR(255) NOT NULL,
    professor_email VARCHAR(255) NOT NULL,
    PRIMARY KEY (professor_id),
    UNIQUE (professor_id, professor_email)
);

ALTER TABLE discipline
	ADD professor_id INTEGER,
    ADD FOREIGN KEY (professor_id) REFERENCES professor (professor_id) ON DELETE RESTRICT ON UPDATE CASCADE;

ALTER TABLE academic_discipline
    MODIFY occurr_year YEAR;

CREATE TABLE IF NOT EXISTS program_course (
    program_id INTEGER NOT NULL,
    program_name VARCHAR(255) NOT NULL,
    PRIMARY KEY (program_id)
);

CREATE TABLE IF NOT EXISTS program_academic (
    academic_id INTEGER,
    program_id INTEGER,
    date_enrolment DATETIME NOT NULL,
    PRIMARY KEY (academic_id, program_id),
    FOREIGN KEY (academic_id) REFERENCES academic (academic_id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (program_id) REFERENCES program_course (program_id) ON DELETE RESTRICT ON UPDATE CASCADE
);

CREATE TABLE IF NOT EXISTS program_discipline (
    program_id INTEGER,
    discipline_id INTEGER,
    PRIMARY KEY (program_id, discipline_id),
    FOREIGN KEY (program_id) REFERENCES program_course (program_id) ON DELETE RESTRICT ON UPDATE CASCADE,
    FOREIGN KEY (discipline_id) REFERENCES discipline (discipline_id) ON DELETE RESTRICT ON UPDATE CASCADE
);

INSERT INTO academic (academic_id, academic_name, academic_email, birth_date) VALUES
    (003456, 'John Doe', 'id003456@university.com', '2000-01-01'),
    (003457, 'George Smith', 'id003457@university.com', '1998-07-13');

INSERT INTO professor (professor_id, professor_name, professor_email) VALUES
    (123456789, 'Jane Doe', 'janeD@school.university');

INSERT INTO program_course (program_id, program_name) VALUES
    (1, 'Program 1'),
    (2, 'Program 2');

INSERT INTO discipline (discipline_id, discipline_name, credits, professor_id) VALUES
    (1, 'Discipline 1', 13, 123456789);

INSERT INTO program_discipline (program_id, discipline_id) VALUES
    (1, 1),
    (2, 1);

INSERT INTO program_academic (academic_id, program_id, date_enrolment) VALUES
    (003456, 1, '2000-01-01'),
    (003457, 2, '2000-01-01');

INSERT INTO academic_discipline (academic_id, discipline_id, occurr_year, semester, mark) VALUES
    (003456, 1, 2000, 1),
    (003456, 1, 2001, 2),
    (003457, 1, 2002, 1);