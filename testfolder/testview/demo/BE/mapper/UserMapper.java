package com.crud1.demo.BE.mapper;

import com.crud1.demo.BE.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public class UserMapper {
    List<User> findAll();
    int insert(User user);
    int update(User user);
    int delete(User user);
}
