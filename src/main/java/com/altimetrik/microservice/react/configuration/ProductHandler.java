package com.altimetrik.microservice.react.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class ProductHandler {

	public Mono<ServerResponse> product(ServerRequest request) {
		return ServerResponse.ok().body(BodyInserters.fromObject("Called product"));
	}

	public Mono<ServerResponse> createProduct(ServerRequest request) {
		return ServerResponse.ok().body(BodyInserters.fromObject("Called createProduct"));
	}
}
