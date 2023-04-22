package com.itheima.service;

import com.itheima.domain.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :BookService
 * @date :2023/3/19/14:45
 */
@Transactional
public interface BookService {
    /**
     * 保存
     * @param book
     * @return
     */
    boolean save(Book book);

    /**
     * 按照id删除
     * @param id
     * @return
     */
    boolean delete(Integer id);

    /**
     * 修改
     * @param book
     * @return
     */
    boolean update(Book book);

    /**
     * 按照id查询
     * @param id
     * @return
     */
    Book getById(Integer id);

    /**
     * 查询所有
     * @return
     */
    List<Book> getAll();
}
