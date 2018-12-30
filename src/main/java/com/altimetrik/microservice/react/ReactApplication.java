package com.altimetrik.microservice.react;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.config.AbstractReactiveMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

import com.altimetrik.microservice.react.configuration.ReactWebClient;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;

@SpringBootApplication
@EnableReactiveMongoRepositories
public class ReactApplication extends AbstractReactiveMongoConfiguration {

	public static void main(String[] args) {
		SpringApplication.run(ReactApplication.class, args);

//		System.out.println("Customer: " + new CustomerWebClient().getResult());
//		System.out.println("Order" + new OrderWebClient().getResult());
//		System.out.println("Prodcut" + new ProductWebClient().getResult());
		
		System.out.println("Output: " + new ReactWebClient().getResult());

	}

	@Bean
	public MongoClient mongoClient() {
		return MongoClients.create();
	}

	@Override
	protected String getDatabaseName() {
		return "product-database";
	}

	@Override
	public MongoClient reactiveMongoClient() {
		return mongoClient();
	}
}
