package com.lgypro;

import com.lgypro.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookServiceEbi = (BookService) context.getBean("bookServiceEbi");
        bookServiceEbi.save();
    }
}
