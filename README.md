# client-management-webapp

#### Basic info
Simple Spring Boot webapp to track information about customers (CRUD).

#### The app uses
- frontend: HTML, CSS, Thymeleaf template engine
- persistance: PostgreSQL, Spring Data JPA, Hibernate
- build tool: Gradle

#### Database

```sql
CREATE TABLE customers (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(30),
	last_name VARCHAR(30),
	email VARCHAR(30)
);
```
Inspired by a tutorial of Chad Darby on Udemy.
