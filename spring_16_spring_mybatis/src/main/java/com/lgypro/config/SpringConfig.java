package com.lgypro.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

@Configuration(proxyBeanMethods = false)
@ComponentScan("com.lgypro")
@PropertySource("classpath:jdbc.properties")
@Import(MybatisConfig.class)
public class SpringConfig {
}
