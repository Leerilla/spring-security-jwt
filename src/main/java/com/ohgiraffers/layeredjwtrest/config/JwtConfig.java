package com.ohgiraffers.layeredjwtrest.config;

import com.ohgiraffers.layeredjwtrest.config.userauth.PrincipalDetails;
import org.springframework.stereotype.Component;

@Component
public class JwtConfig {

    private static final long ACCESS_TOKEN_EXPIRE_TIME = 1000*60*240;

    // 진행해야됨
    public String createToken(PrincipalDetails principalDetails, String key){
        
        return null;
    }
}
