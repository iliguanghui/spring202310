package com.lgypro;

import com.lgypro.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForDISetter {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService = context.getBean(BookService.class);
        bookService.save();
    }
}
