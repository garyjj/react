package com.altimetrik.microservice.react.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.altimetrik.microservice.react.bean.Product;
import com.altimetrik.microservice.react.bean.ProductRepository;

import reactor.core.publisher.Mono;

@Component
public class ProductHandler {

	@Autowired
	private ProductRepository productRepository;

	public Mono<ServerResponse> product(ServerRequest request) {
		return ServerResponse.ok().body(productRepository.findAll(), Product.class);
	}

	public Mono<ServerResponse> createProduct(ServerRequest request) {
		return ServerResponse.ok().body(productRepository.insert(request.bodyToMono(Product.class)), Product.class);
	}
}
