package com.zhudake.service;

import com.zhudake.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BooksService {
    //增加一本书
    int addBook(Books books);
    //删除一本书
    int delBookById(int id);
    //修改一本书
    int updateBook(Books books);
    //根据id查询一本书
    Books queryBookById(int id);
    //查询所有的书
    List<Books> queryAllBooks();
    //按书籍名字查询书籍
    Books getBookByName(String searchBookName);
}
