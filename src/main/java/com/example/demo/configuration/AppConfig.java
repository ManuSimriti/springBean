package com.example.demo.configuration;

import com.example.demo.service.Car;
import com.example.demo.service.Engine;
import com.example.demo.service.Plane;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AppConfig {
    @Bean
    public Engine carConfig(){
        return new Car();
    }
    @Bean
    @Primary
    public Engine planeConfig(){
        return new Plane();
    }
}
