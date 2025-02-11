package com.hackaboss.app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.RequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity
               // .csrf(csrf -> csrf.disable())

                /*
                (Cross-Site Request Forgery o Falsificación de Peticiones en Sitios Cruzados) es un ataque en el que un usuario
                autenticado en un sitio web es engañado para realizar acciones no deseadas en ese sitio sin su consentimiento.

                Spring Security habilita la protección CSRF por defecto para evitar que atacantes envíen solicitudes maliciosas
                 en nombre del usuario sin su conocimiento.
                */

                .authorizeHttpRequests(authorize -> authorize
                        .requestMatchers(HttpMethod.POST, "/pruebasecurity/post").permitAll()
                        .requestMatchers("/pruebasecurity/holanoseg").permitAll()
                        .anyRequest().authenticated()
                )
                .formLogin(form -> form.permitAll())
                .build();
    }
}