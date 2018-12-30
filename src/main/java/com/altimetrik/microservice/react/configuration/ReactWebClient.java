package com.altimetrik.microservice.react.configuration;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.ClientResponse;
import org.springframework.web.reactive.function.client.WebClient;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
public class ReactWebClient {
	private WebClient client = WebClient.create("http://localhost:8080");

	private Mono<ClientResponse> result1 = client.get().uri("/customer").accept(MediaType.APPLICATION_JSON).exchange();
	private Mono<ClientResponse> result2 = client.get().uri("/order").accept(MediaType.APPLICATION_JSON).exchange();
	private Mono<ClientResponse> result3 = client.get().uri("/product").accept(MediaType.APPLICATION_JSON).exchange();

	public String getResult() {
		Mono<String> flatMap1 = result1.flatMap(res -> res.bodyToMono(String.class));
		Mono<String> flatMap2 = result2.flatMap(res -> res.bodyToMono(String.class));
		Mono<String> flatMap3 = result3.flatMap(res -> res.bodyToMono(String.class));
		
		return Flux.merge(flatMap1, flatMap2, flatMap3).blockLast();
	}
	
	public String getResults() {
		Mono<String> flatMap1 = result1.flatMap(res -> res.bodyToMono(String.class));
		Mono<String> flatMap2 = result2.flatMap(res -> res.bodyToMono(String.class));
		Mono<String> flatMap3 = result3.flatMap(res -> res.bodyToMono(String.class));
		
		return Flux.merge(flatMap1, flatMap2, flatMap3).blockLast();
		
	}

}
