# Product Service with Docker and Kubernetes

This project provides a **Product Service** application with APIs to create, view, and delete products from a PostgreSQL database. It is built using **Spring Boot** and is deployed with **Docker** and **Kubernetes** for containerization and orchestration.

## Project Structure

- **Spring Boot Application**: A RESTful service with endpoints to manage products.
- **PostgreSQL Database**: A containerized PostgreSQL instance to store product data.
- **Docker**: Used to containerize the Spring Boot application and PostgreSQL database.
- **Kubernetes**: Used for orchestration to deploy, scale, and manage the product service application in the cloud.
- **Minikube**: A local Kubernetes environment to simulate the cloud-based deployment on your machine.

## Getting Started

### Prerequisites

- **Docker**: For containerizing the Spring Boot app and PostgreSQL.
- **Kubernetes** (Minikube or any cloud Kubernetes service): For deploying the application.
- **kubectl**: Kubernetes command-line tool.
- **Git**: For version control and pushing code to GitHub.

- api's used

- /products/add --> to add product to database
- /products/view -->returns all available products
- /delete/id --> deletes particular product

- docker images:
- saiteja413/productsapp-service image is from docker hub which I used to deploy in minikube cluster it corresponds to my spring boot project
- postgres image is responsible for running database container in docker
  

