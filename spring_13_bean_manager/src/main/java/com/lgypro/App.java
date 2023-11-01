package com.lgypro;

import com.lgypro.config.SpringConfig;
import com.lgypro.dao.BookDao;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.registerShutdownHook();
        BookDao bookDao = context.getBean(BookDao.class);
        System.out.println(bookDao);
        System.out.println(context.getBean(BookDao.class));
        System.out.println(context.getBean(BookDao.class));
    }
}
