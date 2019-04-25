package com.ecnu.springbootmybatis.dao;

import com.ecnu.springbootmybatis.entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.SelectKey;

/**
 * @anthor LingChen
 * @create 4/25/2019 4:33 PM
 * @Description
 */
@Mapper
public interface UserMapper {

    @Insert(" insert into user (name, department_id, ) ")
    @Options(useGeneratedKeys=true,keyProperty="id")
    @SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "id", before = false, resultType = long.class)
    long save(User user);
}
