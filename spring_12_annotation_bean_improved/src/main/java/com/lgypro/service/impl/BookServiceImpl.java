package com.lgypro.service.impl;

import com.lgypro.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Override
    public void save() {
        System.out.println("book service save");
    }
}
