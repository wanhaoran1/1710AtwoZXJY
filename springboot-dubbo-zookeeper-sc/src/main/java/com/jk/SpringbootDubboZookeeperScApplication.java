package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;




@SpringBootApplication

@ImportResource(value = "classpath:dubbo-provider.xml")
public class SpringbootDubboZookeeperScApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDubboZookeeperScApplication.class, args);
	}
}
