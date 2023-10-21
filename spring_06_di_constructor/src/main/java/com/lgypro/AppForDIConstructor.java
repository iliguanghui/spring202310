package com.lgypro;

import com.lgypro.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDIConstructor {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
