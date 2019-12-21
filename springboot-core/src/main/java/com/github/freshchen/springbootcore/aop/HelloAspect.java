package com.github.freshchen.springbootcore.aop;

import com.github.freshchen.springbootcore.annotation.Hello;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author : freshchen
 * <P>Created on 2019-12-17 21:48 </p>
 **/
@Aspect
@Component
public class HelloAspect {

    @Pointcut("@annotation(com.github.freshchen.springbootcore.annotation.Hello)")
    private void pointcut(){}

    @Before("pointcut() && @annotation(hello)")
    public void hello(Hello hello){
        System.out.println("你好，" + hello.value());
    }
}
