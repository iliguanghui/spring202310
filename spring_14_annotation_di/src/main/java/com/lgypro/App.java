package com.lgypro;

import com.lgypro.config.SpringConfig;
import com.lgypro.service.BookService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        context.registerShutdownHook();
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
