package com.tourstories.www.mapper;

import com.tourstories.www.Model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import java.util.List;

@Mapper
public interface UserMapper {
    String selectAll = "SELECT * FROM users";
    String insertData = "insert into users(name, pwd) values(#{name}, #{pwd})";
    String statement = "SELECT LAST_INSERT_ID()";
    @Select(selectAll)
    List<User> getUsers();

    @Insert(insertData)
    @SelectKey(statement = statement, keyProperty = "userId", before = false, resultType = Integer.class)
    void insert(User user);


}
