package com.hireme.hiremeapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Permite todas as requisições sem autenticação
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                // Desabilita o CSRF (para facilitar os testes)
                .csrf(csrf -> csrf.disable());
        return http.build();
    }
}
