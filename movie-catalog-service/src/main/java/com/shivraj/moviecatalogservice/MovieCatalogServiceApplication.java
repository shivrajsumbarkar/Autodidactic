package com.shivraj.moviecatalogservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker // It is to activate circuit breaker for fault tolerance and resilience
//@EnableHystrixDashboard //It is used to enable hystrix dashboard to check the circuit breaker pattern and fall back method details and other information
//@EnableConfigClient //It is to read external config management from spring cloud config server
public class MovieCatalogServiceApplication {
	
	@Bean
	@LoadBalanced // It is used for client side load balancing and Service Discovery
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogServiceApplication.class, args);
	}

}
