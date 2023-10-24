package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
/**
 * API-Gateway Perform following operation
 * 	1.	Load Balancing
 * 	2.	Authorization and Authentication (Security)
 *  3.	Monitoring
 *  4.	Dynamic Routing
 *  5.  Static response handling 
 *  6.  Caching
 *  7.  Rate Limiting
 *  
 * @author SHIVRAJ S. UMBARKAR
 *
 */
@SpringBootApplication
@EnableZuulProxy 
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
