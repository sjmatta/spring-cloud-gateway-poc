package com.stephenmatta.gateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class HelloWorldRoute {

    @Bean
    RouteLocator helloRoute(RouteLocatorBuilder builder) {
        return builder.routes()
            .route(p -> p
                .path("/helloworld")
                .filters(f -> f
                    .rewritePath("/helloworld", "/get")
                    .addRequestHeader("Hello", "World"))
                .uri("http://httpbin.org:80"))
            .build();
    }
}
