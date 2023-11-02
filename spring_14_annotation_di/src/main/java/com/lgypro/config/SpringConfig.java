package com.lgypro.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.lgypro.config", "com.lgypro.dao.impl", "com.lgypro.service.impl"})
@PropertySource("classpath:jdbc.properties")
public class SpringConfig {
}
