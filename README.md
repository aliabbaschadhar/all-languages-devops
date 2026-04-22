# all-languages-devops

Each sample program reads the `GREETING` environment variable and falls back to `Hello, World!` when it is not set.

The JavaScript sample now runs an Express backend with `/` and `/health` routes.

## Lightweight Backends (Java, Go, Elixir, Kotlin)

The following folders are set up as lightweight backend services with:

- `GET /` returning `{"message":"..."}`
- `GET /health` returning `{"status":"ok"}`
- `PORT` environment variable (default `8080`)
- `GREETING` environment variable for the root endpoint message

### Java (Spring Boot)

```bash
cd java
mvn spring-boot:run
```

### Go (net/http)

```bash
cd go
go run .
```

### Elixir (Plug + Cowboy)

```bash
cd elixr
mix deps.get
mix run --no-halt
```

### Kotlin (Ktor)

```bash
cd kotlin
./gradlew run
```