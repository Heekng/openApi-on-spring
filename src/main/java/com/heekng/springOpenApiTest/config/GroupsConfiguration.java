package com.heekng.springOpenApiTest.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class GroupsConfiguration {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI().components(new Components()).info(new Info().title("Spring MVC REST API")
                .contact(new Contact().name("Rasika Kaluwalgoda")).version("1.0.0"));
    }
}
