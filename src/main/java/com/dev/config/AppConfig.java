package com.dev.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/*@Configuration
@EnableJpaRepositories(basePackages="com.dev.repository")
@EnableWebMvc
@EntityScan(basePackages="com.dev.domain")
@ComponentScan(basePackages="com.dev")
@EnableAutoConfiguration*/
public class AppConfig {

}
