package com.altimetrik.microservice.react.configuration;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;

@Component
public class OrderHandler {

	public Mono<ServerResponse> order(ServerRequest request) {
		return ServerResponse.ok().body(BodyInserters.fromObject("Called order"));
	}
	
	public Mono<ServerResponse> createOrder(ServerRequest request) {
		return ServerResponse.ok().body(BodyInserters.fromObject("Called createOrder"));
	}
}
