package com.zephyr.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zephyr.service.ZephyrLoadBalanceService;

@RestController
public class ZephyrLoadBalanceApi {

	@Autowired
	ZephyrLoadBalanceService zephyrLoadBalanceService;
	
	@GetMapping("/hi")
	public String hello(@RequestParam String name) {
		return zephyrLoadBalanceService.getHello(name);
	}
}
