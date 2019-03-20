package com.zephyr.service;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class ZephyrLoadBalanceService {

	@Autowired
	RestTemplate restTemplate;
	
	public String getHello(String name) {
		URI targetUrl = UriComponentsBuilder.fromUriString("http://ZEPHYR-EUREKA-CLIENT/hi")
				.queryParam("name", name)
				.build().toUri();
		
		return restTemplate.getForObject(targetUrl, String.class);
	}
}
