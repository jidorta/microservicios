package com.ibandorta.app.item;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class AppConfig {
	
	@Bean("clienteRest")
	@LoadBalanced
	public RestTemplate registrarRestTemplate() {
		return new RestTemplate();
	}
	
	
	@Bean("clienteRest")
	@LoadBalanced
	public RestTemplate registrarRestTemplateProducto() {
		return new RestTemplate();
	}


}

