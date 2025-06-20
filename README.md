# 🔐 AuthService – Spring Boot Authentication Microservice

A lightweight and pluggable **registration and login microservice** built with Spring Boot, Spring Security, JWT, and PostgreSQL.

This microservice can be easily reused in other projects by adding it as a Maven dependency (via JitPack).

---

## 🚀 Features

- Register new users securely
- Login with JWT token generation
- Passwords are hashed using BCrypt
- Stateless JWT-based authentication
- Spring Security configuration
- Easily deployable and embeddable via JitPack

---

## ⚙️ Tech Stack

- Java 17+
- Spring Boot 3.x
- Spring Security
- JWT (JJWT)
- PostgreSQL (via Render or ElephantSQL)
- Maven
- Lombok

---

## 📦 Usage

### 🧩 1. Add Dependency (via JitPack)

Make sure your repository is public and tagged (e.g., `v1.0`). Then add the following in your `pom.xml`:

```xml
<repositories>
  <repository>
    <id>jitpack.io</id>
    <url>https://jitpack.io</url>
  </repository>
</repositories>

<dependency>
  <groupId>com.github.tejeshreddy</groupId>
  <artifactId>authservice</artifactId>
  <version>v1.0</version>
</dependency>
