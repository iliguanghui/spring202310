package com.lgypro;

import com.lgypro.config.SpringConfig;
import com.lgypro.domain.Account;
import com.lgypro.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class AppNew {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        AccountService accountService = context.getBean(AccountService.class);
        List<Account> allAccounts = accountService.findAll();
        allAccounts.forEach(System.out::println);
        System.out.println("---- another query");
        Account account = accountService.findById(1);
        System.out.println(account);
    }
}
