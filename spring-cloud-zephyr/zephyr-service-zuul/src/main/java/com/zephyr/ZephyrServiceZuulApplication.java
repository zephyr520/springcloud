package com.zephyr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // 开启zuul的功能
@EnableEurekaClient
@EnableDiscoveryClient
public class ZephyrServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZephyrServiceZuulApplication.class, args);
	}

}