package br.edu.ifmg.produto.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // Metodo de segurança ao se conectar a api, que intervem em todas as requisições para verificar se existe permissão
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(authorize ->
                // Permite rodar as requisições sem pedir autenticação com senha -> permite todas
                authorize.requestMatchers("/**").permitAll().anyRequest().authenticated()
        );
        return http.build();
    }
}
