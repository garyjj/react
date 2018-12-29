package com.altimetrik.microservice.react.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class CustomerRouter {

	@Bean
	public RouterFunction<ServerResponse> customerRoutes(CustomerHandler customerHandler) {

		return RouterFunctions.route(RequestPredicates.GET("/customer"), customerHandler::customer)
				.andRoute(RequestPredicates.POST("/createCustomer"), customerHandler::createCustomer);
	}
}
