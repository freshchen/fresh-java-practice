package com.ecnu.springbootelasticsearch.dao;

import com.ecnu.springbootelasticsearch.entity.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @program: fresh-java-framework
 * @Date: 2019/5/15 0:33
 * @Author: Ling Chen
 * @Description:
 */
public interface BookDao extends CrudRepository <Book, String> {
    public List<Book> getByMessage(String key);
}
