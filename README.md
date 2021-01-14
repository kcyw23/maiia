# maiia

## Tools and Technologies used

* Spring boot 2.4.1
* MongoDB
* Eclipse
* Java1.8

## Step to install

1. **Clone the application**

```bash
git clone https://github.com/kcyw23/maiia.git
```

2. **Build and run the backend app using maven**

```bash
mvn clean package
java -jar target/spring-boot-mongodb-rest-api-0.0.1-SNAPSHOT.jar
```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The backend server will start at <http://localhost:8080>.
