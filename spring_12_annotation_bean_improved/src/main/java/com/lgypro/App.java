package com.lgypro;

import com.lgypro.config.SpringConfig;
import com.lgypro.dao.BookDao;
import com.lgypro.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        System.out.println(bookDao);
        bookDao.save();
        BookService bookService = context.getBean(BookService.class);
        System.out.println(bookService);
        bookService.save();
    }
}
