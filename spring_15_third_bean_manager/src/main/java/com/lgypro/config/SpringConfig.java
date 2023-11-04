package com.lgypro.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration(proxyBeanMethods = false)
@Import(JdbcConfig.class)
@PropertySource("classpath:jdbc.properties")
@ComponentScan("com.lgypro.dao.impl")
public class SpringConfig {
}
