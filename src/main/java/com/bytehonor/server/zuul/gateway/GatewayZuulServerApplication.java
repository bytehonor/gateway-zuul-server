package com.bytehonor.server.zuul.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringCloudApplication
public class GatewayZuulServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewayZuulServerApplication.class, args);
	}
	
}
