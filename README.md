# Event-Driven Architecture Demo with Kafka, Spring Boot, and Java 17

This demo project showcases the implementation of Event-Driven Architecture (EDA) using Apache Kafka, Spring Boot, and Java 17. The project consists of three services: Order Service, Stock Service, and Email Service, communicating via Kafka topics.

## Prerequisites

- Java 17 installed
- Apache Kafka installed and running locally
- Maven installed

## Setup

1. Clone the repository:
   ```bash
   git clone <repository_url>

Creating a comprehensive demo project with a README file for Event-Driven Architecture (EDA) using Kafka, Spring Boot, and Java 17 would require more space and time than is suitable for this format. However, I can provide you with a simplified version along with a README file that outlines the basic structure and steps to run the project.

README.md:

markdown
Copy code
# Event-Driven Architecture Demo with Kafka, Spring Boot, and Java 17

This demo project showcases the implementation of Event-Driven Architecture (EDA) using Apache Kafka, Spring Boot, and Java 17. The project consists of three services: Order Service, Stock Service, and Email Service, communicating via Kafka topics.

## Prerequisites

- Java 17 installed
- Apache Kafka installed and running locally
- Maven installed

## Setup

1. Clone the repository:
   ```bash
   git clone https://github.com/Usmanv45/Event-Driven-Architecture-ApacheKafka
Navigate to the project directory:

cd event-driven-architecture-kafka

# Start ZooKeeper (if not already running)
zookeeper-server-start.sh config/zookeeper.properties

# Start Kafka server
kafka-server-start.sh config/server.properties
cd event-driven-architecture-kafka

# Start ZooKeeper (if not already running)
zookeeper-server-start.sh config/zookeeper.properties

# Start Kafka server
kafka-server-start.sh config/server.properties

# Create topics (e.g., order-topic)
kafka-topics.sh --create --topic eventTopic --bootstrap-server localhost:9092

# Running the Services

## Order Service:
cd order-service
mvn spring-boot:run

## Stock Service:
cd ../stock-service
mvn spring-boot:run

## Email Service:
cd ../email-service
mvn spring-boot:run


# Running the Services

## Order Service:
cd order-service
mvn spring-boot:run

## Stock Service:
cd ../stock-service
mvn spring-boot:run

## Email Service:
cd ../email-service
mvn spring-boot:run
