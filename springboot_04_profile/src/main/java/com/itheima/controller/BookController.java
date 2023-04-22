package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :liangyuhang1
 * @className :BookController
 * @date :2023/3/25/17:35
 */
@RestController
@RequestMapping("/books")
public class BookController {
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id) {
        System.out.println("id ===> " + id);
        return "Hello Springboot";

    }

    @GetMapping
    public String getAll() {
        System.out.println("getAll()...");
        return "getAll()...";
    }
}
