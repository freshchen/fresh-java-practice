package com.github.freshchen.springbootcore.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Documented
@Target(ElementType.TYPE)
@Import(MySelector.class)
public @interface EnableMySelector {
}
