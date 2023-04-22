package com.itheima.service.impl;

import com.itheima.controller.Code;
import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import com.itheima.exception.BusinessException;
import com.itheima.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :BookServiceImpl
 * @date :2023/3/19/14:45
 */
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    BookDao bookDao;

    /**
     * 保存
     *
     * @param book
     * @return
     */
    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    /**
     * 按照id删除
     *
     * @param id
     * @return
     */
    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    /**
     * 修改
     *
     * @param book
     * @return
     */
    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    /**
     * 按照id查询
     *
     * @param id
     * @return
     */
    @Override
    public Book getById(Integer id) {
        if (id == 1) {
            //抛出BusinessException异常
            throw new BusinessException(Code.BUSINESS_ERR, "请不要使用你的技术...");
        }

        return bookDao.getById(id);
    }

    /**
     * 查询所有
     *
     * @return
     */
    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
