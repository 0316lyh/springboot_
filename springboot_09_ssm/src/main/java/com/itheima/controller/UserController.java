package com.itheima.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author :liangyuhang1
 * @className :UserController
 * @date :2023/3/24/14:59
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/getAll")
    public String getAll() {
        return "getAll()...";
    }
}
