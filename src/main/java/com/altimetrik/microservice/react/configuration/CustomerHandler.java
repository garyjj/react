package com.altimetrik.microservice.react.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class CustomerHandler {

	public Mono<ServerResponse> customer(ServerRequest request) {
		return ServerResponse.ok().body(BodyInserters.fromObject("Called customer"));
	}

	public Mono<ServerResponse> createCustomer(ServerRequest request) {
		return ServerResponse.ok().body(BodyInserters.fromObject("Called createCustomer"));
	}
}
