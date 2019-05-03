package com.example.SCGDemoRedisMVS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class ScgDemoRedisMvsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScgDemoRedisMvsApplication.class, args);
	}

	@Bean("userKeyResolver")
	KeyResolver userKeyResolver() {
		return exchange -> Mono.just("test");
	}

}
