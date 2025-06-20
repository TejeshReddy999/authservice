# 🔐 AuthService – Spring Boot Authentication Microservice

A lightweight, secure, and reusable **Registration and Login Microservice** built with Spring Boot, Spring Security, and JWT — designed to be easily embedded into any Java project via Maven dependency.

---

## 🚀 Key Features

- **User Registration:** Secure signup with email and password validation.
- **JWT Authentication:** Stateless, token-based login for scalable security.
- **Password Security:** Industry-standard BCrypt password hashing.
- **Spring Security Integration:** Flexible security configuration out-of-the-box.
- **Plug & Play:** Add as a Maven dependency from GitHub via JitPack.
- **Database Support:** PostgreSQL ready; use cloud-hosted free services like ElephantSQL or Render.
- **Clean & Maintainable:** Uses Lombok for boilerplate reduction and follows best practices.

---

## 🛠️ Technology Stack

| Technology         | Purpose                             |
|--------------------|-----------------------------------|
| Java 17+           | Core programming language          |
| Spring Boot 3.x    | Application framework              |
| Spring Security    | Authentication & authorization    |
| JWT (JJWT)         | JSON Web Tokens for authentication|
| PostgreSQL         | Relational database                |
| Maven              | Build and dependency management   |
| Lombok             | Code simplification               |

---

## 📦 Usage

### 1. Add JitPack Repository

Add JitPack repository in your project's `pom.xml`:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>
### 2. Add AuthService Dependency
<dependency>
  <groupId>com.github.TejeshReddy999</groupId>
  <artifactId>authservice</artifactId>
  <version>1.0.1</version>
</dependency>

