package com.zephyr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.key.resolver.HostAddrKeyResolver;

@SpringBootApplication
@RestController
public class ZephyrGatewayLimiterApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZephyrGatewayLimiterApplication.class, args);
	}
	
	@Bean
	public HostAddrKeyResolver hostAddrKeyResolver() {
		return new HostAddrKeyResolver();
	}
}
