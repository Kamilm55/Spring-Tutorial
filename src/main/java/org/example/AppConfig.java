package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {
//    @Bean
//    public Bus getBus(){
//        return new Bus();
//    }
//    @Bean
//    public Bike getBike(){
//        return new Bike();
//    }
}
