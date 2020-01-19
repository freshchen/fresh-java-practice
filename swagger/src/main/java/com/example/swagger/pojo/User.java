package com.example.swagger.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author : freshchen
 * <P>Created on 2020-01-18 20:00 </p>
 **/
@ApiModel(description = "用户")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @ApiModelProperty("姓名")
    private String name;
    @ApiModelProperty("年龄")
    private Integer age;
}
