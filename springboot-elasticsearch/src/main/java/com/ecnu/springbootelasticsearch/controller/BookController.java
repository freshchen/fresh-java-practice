package com.ecnu.springbootelasticsearch.controller;

import com.ecnu.springbootelasticsearch.dao.BookDao;
import com.ecnu.springbootelasticsearch.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @program: fresh-java-framework
 * @Date: 2019/5/15 0:35
 * @Author: Ling Chen
 * @Description:
 */
@RestController
@RequestMapping("/api/es")
public class BookController {

    @Autowired
    private BookDao bookDao;

    @RequestMapping("/book/{id}")
    public Book getbookById(@PathVariable String id) {
        Optional <Book> opt = bookDao.findById(id);
        Book book = opt.get();
        return book;
    }

}
