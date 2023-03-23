package com.bydanovm.springl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.bydanovm.springl.Parrot;

@Configuration
public class ProjectConfig {
    
    @Bean
    Parrot parrot(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }
    
    @Bean
    String hello(){
        return "Hello";
    }

    @Bean
    Integer ten(){
        return 10;
    }
}