package com.bydanovm.springl.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.bydanovm.springl.Parrot;

@Configuration
public class ProjectConfig {
    
    @Bean
    Parrot parrot1(){
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean(name = "miki")
    Parrot parrot2(){
        Parrot p = new Parrot();
        p.setName("Miki");
        return p;
    }

    @Bean
    @Primary
    Parrot parrot3(){
        Parrot p = new Parrot();
        p.setName("Riki");
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