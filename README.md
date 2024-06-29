### Project Details 
|||
|---|---|
|Project|Maven|
|Language|Java|
|Spring Boot|2.7.6|
|Java|17|
|Packaging|Jar|

### Dependencies 

- Spring Web

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>

- Spring Data JPA 

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jpa</artifactId>
		</dependency>

- MySQL Driver

		<dependency>
			<groupId>com.mysql</groupId>
			<artifactId>mysql-connector-j</artifactId>
			<scope>runtime</scope>
		</dependency>

- Lombok

		<dependency>
			<groupId>org.projectlombok</groupId>
			<artifactId>lombok</artifactId>
			<optional>true</optional>
		</dependency>

- H2 Database

		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>

- Spring Actuator

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

- jackson-dataformat-xml
    - Data format extension for Jackson to offer alternative support for serializing POJOs as XML and deserializing XML as pojos.
        <dependency>
            <groupId>com.fasterxml.jackson.dataformat</groupId>
            <artifactId>jackson-dataformat-xml</artifactId>
        </dependency>

### Entities :


### Spring Boot Profiles

- application.properties
- application-dev.properties
- aplication-prod.properties

### Spring Boot with H2 Database

- http://localhost:9090/h2-console

### Spring Boot Actuator

- http://localhost:9090/actuator

### SpringBoot Logging

```
[
    {
        "title": "Wireless Headphones",
        "description": "Bluetooth over-ear headphones with noise-cancellation and 20 hours battery life.",
        "price": 99.99,
        "quantity": 150
    },
    {
        "title": "Smartphone",
        "description": "Latest model with 6.5-inch display, 128GB storage, and 48MP camera.",
        "price": 699.99,
        "quantity": 85
    },
    {
        "title": "Gaming Laptop",
        "description": "High-performance laptop with 16GB RAM, 512GB SSD, and RTX 3060 GPU.",
        "price": 1299.99,
        "quantity": 40
    },
    {
        "title": "4K TV",
        "description": "65-inch Ultra HD TV with HDR and smart features.",
        "price": 899.99,
        "quantity": 30
    },
    {
        "title": "Electric Scooter",
        "description": "Foldable electric scooter with 15-mile range and 15 mph top speed.",
        "price": 299.99,
        "quantity": 75
    },
    {
        "title": "Fitness Tracker",
        "description": "Waterproof fitness tracker with heart rate monitor and GPS.",
        "price": 49.99,
        "quantity": 200
    },
    {
        "title": "Digital Camera",
        "description": "24MP DSLR camera with 18-55mm lens and full HD video recording.",
        "price": 549.99,
        "quantity": 25
    },
    {
        "title": "Bluetooth Speaker",
        "description": "Portable speaker with 12-hour battery life and deep bass.",
        "price": 39.99,
        "quantity": 120
    },
    {
        "title": "Smartwatch",
        "description": "Smartwatch with fitness tracking, phone notifications, and music control.",
        "price": 199.99,
        "quantity": 60
    },
    {
        "title": "Tablet",
        "description": "10-inch tablet with 64GB storage, Wi-Fi, and 10-hour battery life.",
        "price": 249.99,
        "quantity": 90
    },
    {
        "title": "Noise-Canceling Earbuds",
        "description": "In-ear earbuds with active noise cancellation and 8 hours battery life.",
        "price": 79.99,
        "quantity": 140
    },
    {
        "title": "Smart Thermostat",
        "description": "Wi-Fi enabled smart thermostat with energy-saving features and remote control.",
        "price": 199.99,
        "quantity": 50
    }
]
```

