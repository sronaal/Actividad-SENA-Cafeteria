# ☕ Cafetería SENA - Spring Boot

Ejercicio práctico de **Java con Spring Boot** desarrollado como actividad formativa del SENA.

## Descripción
API REST básica que simula el backend de una cafetería, implementando endpoints para bienvenida, información del curso y cálculo de totales de productos.

## Tecnologías
- Java 17+
- Spring Boot 3.x
- Maven / Gradle

## Endpoints

| Método | Ruta | Descripción |
|--------|------|-------------|
| GET | `/`, `/bienvenido` | Mensaje de bienvenida |
| GET | `/info` | Información de la sesión |
| GET | `/productos` | Lista de productos disponibles |
| GET | `/total/{precio}/{cantidad}` | Calcular total de un pedido |

## Ejecución
```bash
./mvnw spring-boot:run