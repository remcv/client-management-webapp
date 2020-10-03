-- main database table
CREATE TABLE customers (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	email VARCHAR(30)
);

-- insert some rows
INSERT INTO customers (first_name, last_name, email) VALUES
	('Mircea', 'Ionescu', 'mi@email.com'),
	('Codrin', 'Escu', 'ce@email.com'),
	('Ion', 'Prostu', 'ip@email.com');

-- queries
SELECT * FROM customers;