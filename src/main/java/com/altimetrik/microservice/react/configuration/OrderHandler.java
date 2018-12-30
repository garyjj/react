package com.altimetrik.microservice.react.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.altimetrik.microservice.react.bean.Order;
import com.altimetrik.microservice.react.bean.OrderRepository;

import reactor.core.publisher.Mono;

@Component
public class OrderHandler {

	@Autowired
	private OrderRepository orderRepository;

	public Mono<ServerResponse> order(ServerRequest request) {
		return ServerResponse.ok().body(orderRepository.findAll(), Order.class);
	}

	public Mono<ServerResponse> createOrder(ServerRequest request) {
		return ServerResponse.ok().body(orderRepository.insert(request.bodyToMono(Order.class)), Order.class);
	}
}
