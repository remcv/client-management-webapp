-- main database table
CREATE TABLE customers (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	email VARCHAR(30)
);

-- queries
SELECT * FROM customers;