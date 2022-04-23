package com.example.demo;

import com.example.demo.service.Engine;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ConfigurationBeanApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ConfigurationBeanApplication.class, args);
		Engine engine = context.getBean(Engine.class);
		engine.start();
		engine.run();
		engine.stop();
	}

}
