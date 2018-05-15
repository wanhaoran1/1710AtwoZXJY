package com.jk.mapper;

import com.jk.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2018/5/4.
 */
@Mapper
public interface UserMapper {
    @Select("select * from user")
    List<User> queryUser();
    @Insert("insert into user (username,age,sex,yn) values(#{username},#{age},#{sex},#{yn})")
    void addUser(User use);

    @Select("select * from user where id=#{xid}")
    User queryidUser(String xid);
}
