package com.lgypro;

import com.lgypro.config.SpringConfig;
import com.lgypro.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        accountService.transfer("Tom", "Jerry", 500);
    }
}
