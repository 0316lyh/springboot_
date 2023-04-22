package com.itheima;

import com.itheima.dao.BookDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot08MybatisApplicationTests {
	@Autowired
	private BookDao bookDao;

	@Test
	void testSelectById() {
		Book book = bookDao.getById(1);
		System.out.println(book);
	}

	@Test
	void testSelectAll(){
		List<Book> books = bookDao.getAll();
		System.out.println(books);
	}

}
