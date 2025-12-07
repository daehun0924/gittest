package com.crud1.demo.BE.service.impl;

import com.crud1.demo.BE.domain.User;
import com.crud1.demo.BE.mapper.UserMapper;
import com.crud1.demo.BE.service.UserService;

import java.util.List;

public class UserSeviceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public List<User> getAll(){
        return userMapper.findAll();
    }

    @Override
    public User getById(Long id) {
        return userMapper.findById(id);
    }

    @Override
    public void create(User user) {
        userMapper.insert(user);
    }

    @Override
    public void update(User user) {
        userMapper.update(user);
    }

    @Override
    public void delete(Long id) {
        userMapper.delete(id);
    }

}
