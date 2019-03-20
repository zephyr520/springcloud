package com.zephyr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class ZephyrEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZephyrEurekaClientApplication.class, args);
	}
	
	@Value("${server.port}")
	private Integer port;
	
	@GetMapping("/hi")
	public String home(@RequestParam(value = "name", defaultValue = "zephyr") String name) {
		return "hi " + name + " ,i am from port:" + port;
	}

}
