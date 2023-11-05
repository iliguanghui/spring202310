package com.lgypro.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan({"com.lgypro.dao.impl", "com.lgypro.aop"})
@EnableAspectJAutoProxy
public class SpringConfig {
}
