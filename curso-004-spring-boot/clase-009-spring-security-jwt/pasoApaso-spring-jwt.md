# Implementación de JWT en un proyecto Spring Boot

## Introducción
JSON Web Token (JWT) es un estándar que permite transmitir información entre dos partes de manera segura como un objeto JSON firmado. En este documento, se describen los pasos necesarios para implementar JWT en una aplicación Spring Boot.

---

## Paso 1: Añadir dependencias

1. Ve a [Spring Initializr](https://start.spring.io/) y genera un nuevo proyecto seleccionando las siguientes dependencias:
   - **Spring Web**
   - **Spring Security**

2. Agrega las dependencias necesarias para trabajar con JWT en el archivo `pom.xml`:

```xml
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-api</artifactId>
    <version>0.12.3</version>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-impl</artifactId>
    <version>0.12.3</version>
    <scope>runtime</scope>
</dependency>
<dependency>
    <groupId>io.jsonwebtoken</groupId>
    <artifactId>jjwt-jackson</artifactId>
    <version>0.12.3</version>
    <scope>runtime</scope>
</dependency>
```

---

## Paso 2: Crear una clase para generar y validar tokens

Crea una clase llamada `JwtUtil` para manejar la generación y validación de los tokens JWT:

```java
package com.ejercicios.springSecurity.jwt;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.Claims;
import javax.crypto.SecretKey;
import io.jsonwebtoken.security.Keys;
import java.util.Date;

public class JwtUtil {

    private static final String SECRET_KEY = "esta_es_una_llave_super_segura_para_JWT";

    public String generateToken(String username) {
        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60)) // 1 hora de validez
                .signWith(getSigningKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public Claims extractClaims(String token) {
        return Jwts.parserBuilder()
                .setSigningKey(getSigningKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    public String extractUsername(String token) {
        return extractClaims(token).getSubject();
    }

    public boolean isTokenValid(String token, String username) {
        return extractUsername(token).equals(username) && !isTokenExpired(token);
    }

    private boolean isTokenExpired(String token) {
        return extractClaims(token).getExpiration().before(new Date());
    }

    private SecretKey getSigningKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }
}
```

---

## Paso 3: Configurar seguridad en Spring Security

Modifica la clase de configuración de seguridad (`SecurityConfig`) para usar JWT:

```java
package com.ejercicios.springSecurity.config;

import com.ejercicios.springSecurity.jwt.JwtUtil;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    private final JwtUtil jwtUtil;

    public SecurityConfig(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
            .csrf().disable()
            .authorizeHttpRequests()
                .requestMatchers("/auth/**").permitAll()
                .anyRequest().authenticated()
            .and()
            .addFilter(new JwtAuthenticationFilter(authenticationManager(), jwtUtil))
            .build();
    }
}
```

---

## Paso 4: Crear un endpoint para autenticación

Crea un controlador para autenticar usuarios y devolver un token JWT:

```java
package com.ejercicios.springSecurity.controller;

import com.ejercicios.springSecurity.jwt.JwtUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public String login(@RequestBody Map<String, String> credentials) {
        String username = credentials.get("username");
        String password = credentials.get("password");

        // Validar usuario y contraseña (lógica personalizada)
        if ("usuarioValido".equals(username) && "contraseñaValida".equals(password)) {
            return jwtUtil.generateToken(username);
        }
        throw new RuntimeException("Credenciales inválidas");
    }
}
```

---

## Paso 5: Probar la implementación

1. Inicia la aplicación.
2. Usa una herramienta como Postman para enviar una solicitud POST al endpoint `/auth/login` con el siguiente cuerpo:

```json
{
  "username": "usuarioValido",
  "password": "contraseñaValida"
}
```

3. Recibirás un token JWT como respuesta. Incluye este token en el encabezado `Authorization` para acceder a los endpoints protegidos.

---

## Conclusión
Con estos pasos, has implementado JWT en tu aplicación Spring Boot para autenticar y autorizar usuarios de forma segura.
