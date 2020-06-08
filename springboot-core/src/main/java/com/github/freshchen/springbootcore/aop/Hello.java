package com.github.freshchen.springbootcore.aop;

import java.lang.annotation.*;

@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Hello {

    String value() default "";
}
