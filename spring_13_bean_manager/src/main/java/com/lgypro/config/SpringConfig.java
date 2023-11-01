package com.lgypro.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"com.lgypro.config", "com.lgypro.dao.impl"})
public class SpringConfig {
}
