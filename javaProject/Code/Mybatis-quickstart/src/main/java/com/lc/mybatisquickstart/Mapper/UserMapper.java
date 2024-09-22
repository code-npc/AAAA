package com.lc.mybatisquickstart.Mapper;

import com.lc.mybatisquickstart.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface UserMapper {
   @Select("select * from user")
    public List<User> list();
}
