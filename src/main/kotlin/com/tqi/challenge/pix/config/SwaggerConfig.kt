package com.tqi.challenge.pix.config

import io.swagger.v3.oas.models.info.Info
import org.springdoc.core.customizers.OpenApiCustomizer
import org.springdoc.core.models.GroupedOpenApi
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class SwaggerConfig : WebMvcConfigurer {
    @Bean
    fun apiV1(): GroupedOpenApi =
        GroupedOpenApi.builder()
            .group("v1")
            .addOpenApiCustomizer {
                OpenApiCustomizer { it.info(Info().title("A Simple Pix Crud").version("1")) }
            }
            .packagesToScan("com.tqi.challenge.pix.web.controller")
            .build()
}
