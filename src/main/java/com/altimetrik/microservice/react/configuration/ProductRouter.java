package com.altimetrik.microservice.react.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class ProductRouter {

	@Bean
	public RouterFunction<ServerResponse> route(ProductHandler productHandler) {

		return RouterFunctions.route(RequestPredicates.GET("/product"), productHandler::product)
				.andRoute(RequestPredicates.POST("/createProduct"), productHandler::createProduct);
	}
}
