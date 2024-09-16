# Bookstore Web Application

## Introduction

Welcome to the Bookstore Web Application showcase! This project demonstrates a web application built using Kotlin and Spring Boot. It serves as a backend application for managing a bookstore. The system is designed to handle various operations related to books and authors, including listing, updating, adding, and deleting resources.

## Features

- **Author Management**: Add, update, list, and delete authors.
- **Book Management**: Add, update, list, and delete books.

## Getting Started

To get started with the Bookstore Web Application, follow these steps:

### Installation

1. Clone the repository:

    ```bash
    git clone git@github.com:rv-silva/tilapia.git
    ```

2. Navigate to the project directory:

    ```bash
    cd tilapia
    ```

3. Start the database with `docker-compose`:

    ```bash
    docker-compose up
    
    ```

4. Build & Run the project using Maven:

    ```bash
    mvn clean install && mvn spring-boot:run
    ```

5. Run the frontend application:

    ```bash
    cd frontend && npm run start
    ```

6. Access the application at `http://localhost:3000`.

## API Endpoints

### Authors

- **GET /authors**: List all authors
- **POST /authors**: Add a new author
- **PUT /authors/{id}**: Update an existing author
- **DELETE /authors/{id}**: Delete an author

### Books

- **GET /books**: List all books
- **POST /books**: Add a new book
- **PUT /books/{id}**: Update an existing book
- **DELETE /books/{id}**: Delete a book

## Contributing

Feel free to contribute to this project by submitting issues or pull requests.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgements

- Inspired by [DevTiro's Kotlin Spring Boot Course](https://github.com/devtiro/course-kotlin-spring-boot).

Happy coding!
