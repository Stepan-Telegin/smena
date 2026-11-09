# Smena

Staff shift management REST API for venue personnel. Administrators create shifts and upload schedules; employees mark their availability and get assigned to shifts.

**Current status:** project scaffold.

## Tech Stack

- Java 21, Spring Boot 4.1.1
- Spring Web (MVC), Spring Data JPA
- PostgreSQL 17.11 (Docker, Alpine), Flyway for migrations
- SpringDoc OpenAPI 3 (Swagger UI)
- Actuator, Lombok, Testcontainers
- Maven (wrapper)

## Running locally on Windows

```bash
docker compose up -d
mvnw spring-boot:run
```

## License

MIT. See the `pom.xml` for full license metadata.

## Author

Stepan Telegin — stepan.telegin.dev@gmail.com
