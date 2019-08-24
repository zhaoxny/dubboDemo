package com.example.provider.dao;

import com.example.common.entity.User;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface UserMapper {
    @Results(id = "userMap", value = {
            @Result(column = "id", property = "id"),
            @Result(column = "name", property = "name"),
            @Result(column = "age", property = "age"),
            @Result(column = "sex", property = "sex")})
    @Select("SELECT * FROM u_user")
    List<User> getAll();

    @Select("SELECT * FROM u_user t WHERE t.id = #{id}")
    @ResultMap("userMap")
    User getOne(Integer id);
}