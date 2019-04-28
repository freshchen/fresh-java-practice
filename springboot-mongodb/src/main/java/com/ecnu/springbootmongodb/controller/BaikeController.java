package com.ecnu.springbootmongodb.controller;

import com.ecnu.springbootmongodb.dao.impl.BaikeDaoImpl;
import com.ecnu.springbootmongodb.entity.Baike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @program: fresh-java-framework
 * @Date: 2019/4/28 22:01
 * @Author: Ling Chen
 * @Description:
 */
@RestController
@RequestMapping("/api/mongo")
public class BaikeController {

    @Autowired
    private BaikeDaoImpl baikeDao;

    /** curl http://localhost:27017/api/mongo/addbaike -X POST -H "Content-Type:application/json" -d '"desc":"comewords","comment":"articleContent","tag":"doc"'
     * @param baike
     * @return
     */
    @PostMapping("/addbaike")
    public Baike addBaike(Baike baike) {
        baike.setCreateTime(new Date());
        return baikeDao.saveData(baike, "baike");
    }

    @GetMapping("/query/{name}")
    public List<Baike> queryBaike(@PathVariable String name) {
        return baikeDao.getAllData(name);
    }
}
