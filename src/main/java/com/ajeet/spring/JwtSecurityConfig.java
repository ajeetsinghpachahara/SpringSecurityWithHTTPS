package com.ajeet.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:jwtWebSecurityConfig.xml" })
public class JwtSecurityConfig {

}
