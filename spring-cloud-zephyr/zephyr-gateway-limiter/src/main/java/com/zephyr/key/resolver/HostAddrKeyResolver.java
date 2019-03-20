package com.zephyr.key.resolver;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

public class HostAddrKeyResolver implements KeyResolver {

	@Override
	public Mono<String> resolve(ServerWebExchange exchange) {
		String ip = exchange.getRequest().getRemoteAddress().getAddress().getHostAddress();
		System.out.println("ip = " + ip);
		return Mono.just(ip);
	}

}
