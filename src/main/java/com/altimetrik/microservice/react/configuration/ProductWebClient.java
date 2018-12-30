package com.altimetrik.microservice.react.configuration;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Mono;

@Component
public class ProductWebClient {
	private WebClient client = WebClient.create("http://localhost:8080");

	private Mono<ClientResponse> result = client.get().uri("/product").accept(MediaType.APPLICATION_JSON).exchange();

	public String getResult() {
		return result.flatMap(res -> res.bodyToMono(String.class)).block();
	}
}
