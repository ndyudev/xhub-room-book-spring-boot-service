package com.xhub.room_book;

import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI xhubOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("XHub Booking Room API")
                        .description("REST API tài liệu cho hệ thống đặt phòng")
                        .version("1.0.0"));
    }
}
