DROP TABLE student;

CREATE TABLE student (
  id        INT         NOT NULL GENERATED ALWAYS AS IDENTITY,
  first_name VARCHAR(50) NOT NULL,
  last_name  VARCHAR(50) NOT NULL,
  PRIMARY KEY (id)
)