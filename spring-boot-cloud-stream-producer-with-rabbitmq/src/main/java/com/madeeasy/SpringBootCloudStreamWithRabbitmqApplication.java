package com.madeeasy;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.function.StreamBridge;

@SpringBootApplication
public class SpringBootCloudStreamWithRabbitmqApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudStreamWithRabbitmqApplication.class, args);
	}
}
