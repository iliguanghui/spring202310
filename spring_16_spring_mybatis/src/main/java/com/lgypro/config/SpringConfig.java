package com.lgypro.config;

import org.springframework.context.annotation.*;

@Configuration(proxyBeanMethods = false)
@ComponentScan("com.lgypro")
@PropertySource("classpath:jdbc.properties")
@Import(MybatisConfig.class)
public class SpringConfig {
}
