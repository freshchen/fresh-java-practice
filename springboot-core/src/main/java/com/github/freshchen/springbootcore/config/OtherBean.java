package com.github.freshchen.springbootcore.config;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * @author darcy
 * @since 2020/06/29
 **/
@Data
@AllArgsConstructor
public class OtherBean {

    private MyBean myBean;


}
