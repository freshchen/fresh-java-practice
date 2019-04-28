package com.ecnu.springbootmongodb.dao.impl;

import com.ecnu.springbootmongodb.dao.BaikeDao;
import com.ecnu.springbootmongodb.entity.Baike;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/28 22:14
 * @Author: Ling Chen
 * @Description:
 */
@Component
public class BaikeDaoImpl implements BaikeDao {

    static Logger logger = LoggerFactory.getLogger(BaikeDaoImpl.class);

    @Autowired
    private MongoTemplate mongoTemplate;

    @Override
    public Baike saveData(Baike entity, String collectionName) {
        mongoTemplate.save(entity, collectionName);
        logger.info("save snmp data in {} succeed.", collectionName);
        return entity;
    }

    @Override
    public List <Baike> getAllData(String collectionName) {
        return mongoTemplate.findAll(Baike.class, collectionName);
    }
}
