//package com.darla.configurations;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//public class SecurityConfig {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//        http
//            .cors() // Enable CORS
//            .and()
//            .csrf().disable() // Disable CSRF if needed for testing (use with caution)
//            .authorizeRequests()
//            .antMatchers("/admin/**").permitAll(); // Allow access to your endpoints
//
//        return http.build();
//    }
//}
