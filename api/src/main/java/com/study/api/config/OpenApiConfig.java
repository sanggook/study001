package com.study.api.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI openAPI(){
        Info info = new Info()
                .version("v1.0.0")
                .title("API - Kook's Study Project")
                .description("혼자 적당히 공부한 흔적들");

        return  new OpenAPI()
                .info(info);
    }
}
