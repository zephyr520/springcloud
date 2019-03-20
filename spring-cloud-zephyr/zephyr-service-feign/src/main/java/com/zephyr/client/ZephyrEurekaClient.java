package com.zephyr.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "zephyr-eureka-client")
public interface ZephyrEurekaClient {
	
	@GetMapping("/hi")
	String sayHello(@RequestParam(value = "name") String name);
}
