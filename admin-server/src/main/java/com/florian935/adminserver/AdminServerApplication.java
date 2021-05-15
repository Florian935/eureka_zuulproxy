package com.florian935.adminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class AdminServerApplication {
	public static void main(String[] args) {
		new SpringApplicationBuilder(AdminServerApplication.class)
				.web(WebApplicationType.REACTIVE)
				.run(args);
	}
}
