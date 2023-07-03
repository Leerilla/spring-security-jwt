package com.ohgiraffers.layeredjwtrest.config.filter;

import org.springframework.security.authorization.AuthorizationManager;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter {


}
