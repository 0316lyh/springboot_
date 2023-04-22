package com.itheima.dao;

import com.itheima.domain.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author :liangyuhang1
 * @className :BookDao
 * @date :2023/3/1914:45
 */
@Mapper
public interface BookDao {
    @Insert("insert into tbl_book (type,name,description) values (#{type},#{name},#{description})")
    int save(Book book);

    @Delete("delete from tbl_book where id = #{id}")
    int delete(Integer id);

    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    int update(Book book);

    @Select("select * from tbl_book where id = #{id}")
    Book getById(Integer id);

    @Select("select * from tbl_book")
    List<Book> getAll();
}
