package com.itheima.service;

import com.itheima.Springboot09SsmApplication;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :TestBookService
 * @date :2023/3/31/18:43
 */
@SpringBootTest(classes = Springboot09SsmApplication.class)
public class TestBookService {

    @Autowired
    private BookService bookService;

    @Test
    void testGetAll() {
        List<Book> all = bookService.getAll();
        System.out.println(all);
    }

    @Test
    void testGetById() {
        Object book = bookService.getById(2);
        System.out.println(book);
    }

    @Test
    void testSave() {
        Book book = new Book("1", "2", "3");
        boolean save = bookService.save(book);
        System.out.println(save);
    }

    @Test
    void testUpdate() {
        Book book = new Book(2,"1", "2", "3");
        boolean update = bookService.update(book);
        System.out.println(update);
    }

    @Test
    void testDelete() {
        boolean delete = bookService.delete(1);
        System.out.println(delete);
    }
}
