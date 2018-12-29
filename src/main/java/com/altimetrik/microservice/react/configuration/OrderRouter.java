package com.altimetrik.microservice.react.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class OrderRouter {

	@Bean
	public RouterFunction<ServerResponse> route(OrderHandler orderHandler) {

		return RouterFunctions.route(RequestPredicates.GET("/order"), orderHandler::order)
				.andRoute(RequestPredicates.POST("/createOrder"), orderHandler::createOrder);
	}
}
