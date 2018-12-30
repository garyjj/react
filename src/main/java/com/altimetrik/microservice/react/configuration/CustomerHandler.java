package com.altimetrik.microservice.react.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.altimetrik.microservice.react.bean.Customer;
import com.altimetrik.microservice.react.bean.CustomerRepository;

import reactor.core.publisher.Mono;

@Component
public class CustomerHandler {

	@Autowired
	private CustomerRepository customerRepository;

	public Mono<ServerResponse> customer(ServerRequest request) {
		return ServerResponse.ok().body(customerRepository.findAll(), Customer.class);
	}

	public Mono<ServerResponse> createCustomer(ServerRequest request) {
		return ServerResponse.ok().body(customerRepository.insert(request.bodyToMono(Customer.class)), Customer.class);	
	}
}
