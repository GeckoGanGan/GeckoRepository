package com.zhudake.service;

import com.zhudake.dao.BooksMapper;
import com.zhudake.pojo.Books;

import java.util.List;

public class BooksServiceImpl implements BooksService{

    private BooksMapper booksMapper;

    public void setBooksMapper(BooksMapper booksMapper) {
        this.booksMapper = booksMapper;
    }

    @Override
    public int addBook(Books books) {
        return booksMapper.addBook(books);
    }

    @Override
    public int delBookById(int id) {
        return booksMapper.delBookById(id);
    }

    @Override
    public int updateBook(Books books) {
        return booksMapper.updateBook(books);
    }

    @Override
    public Books queryBookById(int id) {
        return booksMapper.queryBookById(id);
    }

    @Override
    public List<Books> queryAllBooks() {
        return booksMapper.queryAllBooks();
    }

    @Override
    public Books getBookByName(String searchBookName) {
        return booksMapper.getBookByName(searchBookName);
    }
}
