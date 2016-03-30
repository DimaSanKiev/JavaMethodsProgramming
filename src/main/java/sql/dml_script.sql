DROP TABLE student;
DROP TABLE course;

CREATE TABLE student (
  id         INT         NOT NULL GENERATED ALWAYS AS IDENTITY,
  first_name VARCHAR(50) NOT NULL,
  last_name  VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);

CREATE TABLE course (
  id       INT         NOT NULL GENERATED ALWAYS AS IDENTITY,
  name     VARCHAR(50) NOT NULL,
  lecturer VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
);