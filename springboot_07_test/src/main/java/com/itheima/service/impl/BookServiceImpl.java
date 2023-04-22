package com.itheima.service.impl;

import com.itheima.service.BookService;
import org.springframework.stereotype.Service;

/**
 * @author :liangyuhang1
 * @className :BookServiceImpl
 * @date :2023/3/30/16:45
 */
@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("BookService save()...");
    }
}
