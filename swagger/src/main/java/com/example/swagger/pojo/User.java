package com.example.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @author : freshchen
 * <P>Created on 2020-01-18 20:00 </p>
 **/
@ApiModel("用户")
@Data
@AllArgsConstructor
public class User {
    @ApiModelProperty("姓名")
    private String name;
}
