package com.altimetrik.microservice.react.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altimetrik.microservice.react.configuration.ReactWebClient;

@RestController
public class ReactResource {

	@Autowired
	private ReactWebClient reactWebClient;

	@GetMapping("/checkout")
	public String checkoutAgain() {
		return reactWebClient.getResult();
	}
}
