package com.ohgiraffers.layeredjwtrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http.csrf().disable();

        http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and()
                .addFilter(corsFilter()) // 교차 브라우저 사용안함
                .formLogin().disable() // 로그인 페이지 사용안함
                .httpBasic().disable();

        return http.build();
    }

    @Bean
    CorsFilter corsFilter() {
        CorsConfiguration configuration = new CorsConfiguration();
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        configuration.setAllowCredentials(true); // 서버가 응답할 때 json을 자바스크립트에서 처리할 수 있도록 할 것 인지 설정
        configuration.addAllowedOrigin("*"); // 모든 ip에 대한 응답을 허용한
        configuration.addAllowedHeader("*"); // 모든 Header에 대한 응답을 허용함
        configuration.addAllowedMethod("*"); // 모듬 http method 요청에 대한 응답을 허용함
        source.registerCorsConfiguration("/**", configuration);

        return new CorsFilter(source);
    }
}
