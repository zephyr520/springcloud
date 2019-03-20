package com.zephyr.filter;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

@Component
public class MyFilter extends ZuulFilter {

	@Override
	public Object run() throws ZuulException {
		RequestContext ctx = RequestContext.getCurrentContext();
		HttpServletRequest request = ctx.getRequest();
		System.out.println(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
		Object accessToken = request.getParameter("token");
		if (accessToken == null) {
			System.out.println("token is null...");
			ctx.setSendZuulResponse(false);
			ctx.setResponseStatusCode(401);
			try {
				ctx.getResponse().getWriter().write("token is null");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		System.out.println("verify is ok...");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	@Override
	public String filterType() {
		return "pre";
	}

}
