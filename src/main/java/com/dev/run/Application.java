package com.dev.run;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

//@Configuration
@EnableJpaRepositories(basePackages="com.dev.repository")
//@EnableWebMvc
@EntityScan(basePackages="com.dev.domain")
@ComponentScan(basePackages="com.dev")
//@EnableAutoConfiguration
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        String[] beansNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beansNames);
        for(String beanName : beansNames){
        	System.out.println(beanName);
        }
    }
}
