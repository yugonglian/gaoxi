package com.gaoxi.user;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @author anyun
 */
@SpringBootApplication
public class GaoxiUserApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(GaoxiUserApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(GaoxiUserApplication.class, args);
	}

}
