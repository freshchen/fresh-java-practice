package com.ecnu.springbootdubboprovider;

import com.alibaba.dubbo.config.annotation.Service;
import lombok.extern.slf4j.Slf4j;

/**
 * @program: fresh-java-framework
 * @Date: 2019/6/8 10:24
 * @Author: Ling Chen
 * @Description:
 */
@Slf4j
@Service
public class PrintServiceImpl implements PrintService{
    @Override
    public void sayHello() {
      log.info("Hello ,you got me!");
    }
}
