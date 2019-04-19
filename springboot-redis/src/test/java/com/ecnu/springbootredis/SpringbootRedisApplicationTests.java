package com.ecnu.springbootredis;

import com.ecnu.springbootredis.util.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootRedisApplicationTests {

    @Autowired
    private RedisUtil redisUtil;

    @Test
    public void set() throws Exception{
        redisUtil.set("name", "lingc");
    }

}
