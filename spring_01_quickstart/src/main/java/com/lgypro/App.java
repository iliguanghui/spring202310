package com.lgypro;

import com.lgypro.service.BookService;
import com.lgypro.service.impl.BookServiceImpl;

public class App {
    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        bookService.save();
    }
}
