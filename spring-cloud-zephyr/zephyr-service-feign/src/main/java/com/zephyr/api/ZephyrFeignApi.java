package com.zephyr.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.client.ZephyrEurekaClient;

@RestController
public class ZephyrFeignApi {

	@Autowired
	ZephyrEurekaClient zephyrEurekaClient;
	
	@GetMapping("/hi")
	public String hello(@RequestParam String name) {
		return zephyrEurekaClient.sayHello(name);
	}
}
