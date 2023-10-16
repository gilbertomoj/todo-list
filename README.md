# Spring Boot To-Do List REST API


[//]: # ([![Build Status]&#40;https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master&#41;]&#40;https://travis-ci.org/codecentric/springboot-sample-app&#41;)
[//]: # ([![Coverage Status]&#40;https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master&#41;]&#40;https://coveralls.io/github/codecentric/springboot-sample-app?branch=master&#41;)
[//]: # ([![License]&#40;http://img.shields.io/:license-apache-blue.svg&#41;]&#40;http://www.apache.org/licenses/LICENSE-2.0.html&#41;)
## Overview
This is a project for a REST API to manage a to-do list developed using the Spring Boot framework. The API allows users to create, update, retrieve, and delete tasks on their to-do list.

## Requirements

For building and running the application you need:

- JDK 17
- Maven
- IDE of your choice (recommended: Spring Tool Suite or IntelliJ IDEA)
- Postman for testing APIs Endpoints

## Setup
1. Clone this repository:
```bash
git clone https://yourrepository.com/todo-list-spring-boot.git
```
2. Open the project in your IDE.
3. Ensure that the Maven dependencies are downloaded correctly.

## Execution
To start the application, follow the steps below:
1. Run the application from your IDE or via the command line:
```shell
mvn spring-boot:run
```
2. The API will be available at http://localhost:8080. You can change the port in the application.properties file if needed.

## API Endpoints
This api uses Swagger to document its endpoints, to access the Swagger UI go to localhost:8080/swagger-ui/index.html <br>
You can also test the endpoints by importing the file postman/todolist.postman_collection.json in postman desktop application

## Deployment

The api has been deployed using [Render](https://render.com) and is accessible at the following URL:

- [API Deployment on Render](https://todolist-xxns.onrender.com)

To access and use the API, you can make requests to the provided URL. Ensure that you include basic authentication (Username and Password)*

## License
This project is distributed under the [MIT License](LICENSE).
