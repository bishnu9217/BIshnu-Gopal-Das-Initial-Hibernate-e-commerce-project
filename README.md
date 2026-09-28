# Hibernate E-Commerce System

## Project Description

This project is a Hibernate-based Java application for managing an
e-commerce system.

The application uses Hibernate ORM to persist and retrieve data from
a MySQL database.

## Technologies Used

- Java
- Hibernate ORM 6.3.1.Final
- MySQL
- Maven
- JPA Annotations
- Eclipse IDE

## Entities

The project contains the following entities:

- Category
- Product
- Users
- Orders
- OrderDetails

## Entity Relationships

- Category → Product : One-to-Many
- Product → Category : Many-to-One
- Users → Orders : One-to-Many
- Orders → Users : Many-to-One
- Orders → OrderDetails : One-to-Many
- OrderDetails → Orders : Many-to-One
- OrderDetails → Product : Many-to-One

## Features Implemented

- Hibernate configuration with MySQL
- Category insertion
- Product insertion
- User insertion
- Order creation
- Multiple OrderDetails for an Order
- Fetching Orders with associated Users and Products
- Cascade operations
- Lazy fetching

## Project Structure

```text
src/
├── main/
│   ├── java/
│   │   └── com/code/HibernateProject/
│   │       ├── crud/
│   │       ├── entity/
│   │       └── App.java
│   │
│   └── resources/
│       └── hibernate.cfg.xml
│
pom.xml
README.md
