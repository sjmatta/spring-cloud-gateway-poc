package com.stephenmatta.gateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class SoapTemperatureConverterRoute {

    @Bean
    RouteLocator tempRoute(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(p -> p
                .path("/tempconvert")
                .filters(f -> f
                    .rewritePath("/tempconvert", "/xml/tempconvert.asmx"))
                .uri("https://www.w3schools.com/"))
            .build();
    }
}
