DROP DATABASE IF EXISTS zoo;

CREATE DATABASE zoo;
USE zoo;

CREATE TABLE exhibits (
                          id INT PRIMARY KEY,
                          name VARCHAR(255) NOT NULL,
                          num_acres DECIMAL(5,2)
);

CREATE TABLE names (
                       id INT PRIMARY KEY,
                       species_id INT NOT NULL,
                       name VARCHAR(255) NOT NULL,
                       CONSTRAINT fk_species
                           FOREIGN KEY (species_id)
                               REFERENCES exhibits(id)
);

INSERT INTO exhibits (id, name, num_acres) VALUES
                                               (1, 'African Elephant', 7.5),
                                               (2, 'Zebra', 1.2);

INSERT INTO names (id, species_id, name) VALUES
                                             (1, 1, 'Elsa'),
                                             (2, 2, 'Zelda'),
                                             (3, 1, 'Ester'),
                                             (4, 1, 'Eddie'),
                                             (5, 2, 'Zoe');

-- for snippet 2
INSERT INTO exhibits
VALUES (3, 'Asian Elephant', 7.5);

-- for snippet 3
SELECT * FROM exhibits
WHERE ID = 3;

-- for snippet 4
UPDATE exhibits
SET num_acres = num_acres + .5
WHERE name = 'Asian Elephant';

-- for snippet 5
DELETE FROM exhibits
WHERE name = 'Asian Elephant';