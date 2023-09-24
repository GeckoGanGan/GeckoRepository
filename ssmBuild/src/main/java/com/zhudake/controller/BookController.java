package com.zhudake.controller;

import com.zhudake.pojo.Books;
import com.zhudake.service.BooksService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestBindingException;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {

    //查询全部书籍
    @Autowired
    @Qualifier("booksServiceImpl")
    private BooksService booksService;
    @RequestMapping("/allBooks")
    public String getBook(Model model){
        List<Books> booksList = booksService.queryAllBooks();
        model.addAttribute("list",booksList);
        return "allBooks";
    }
    //跳转到toAddBook
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }
    //新增书籍
    @RequestMapping("/addBook")
    public String addBook(Books books){
        System.out.println("books==>"+books);
        booksService.addBook(books);
        return "redirect:/book/allBooks";
    }
    //跳转到修改书籍页面
    @RequestMapping("/toUpdatePage")
    public String toUpdatePage(int id, Model model){
        System.out.println("id=>"+id);
        Books books = booksService.queryBookById(id);
        System.out.println("books=>"+books);
        model.addAttribute("booksByQuery",books);
        return "updatePage";
    }
    //修改书籍
    @RequestMapping("/updateBook")
    public String updateBook(Books books){
        booksService.updateBook(books);
        return "redirect:/book/allBooks";
    }
    //删除书籍
    @RequestMapping("/del/{bookID}")
    public String deleteBook(@PathVariable("bookID") int id){
        booksService.delBookById(id);
        return "redirect:/book/allBooks";
    }
    @RequestMapping("/searchBookByName")
    public String deleteBook2(String bookName,Model model){
        System.out.println("------searchBookByName请求-------");
        System.out.println("bookName=>"+bookName);
        Books books = booksService.getBookByName(bookName);
        List<Books> list = new ArrayList<>();
        if (books==null){
             list = booksService.queryAllBooks();
             model.addAttribute("list",list);
             model.addAttribute("err","输入的书名不能为空！或者不存在！");
        }
        else {
            System.err.println("books=>"+books);
            list.add(books);
            model.addAttribute("list",list);
        }
        return "allBooks";
    }

}
