package com.ecnu.springbootmongodb.dao;

import com.ecnu.springbootmongodb.entity.Baike;

import java.util.List;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/28 22:14
 * @Author: Ling Chen
 * @Description:
 */
public interface BaikeDao {

    Baike saveData(Baike entity, String collectionName);
    List<Baike> getAllData(String collectionName);
}
