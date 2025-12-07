package com.crud1.demo.BE.service;
import com.crud1.demo.BE.domain.User;
import java.util.List;

public class UserService {
    public List<User> getAll();
    void getById(Long id);
    void create(User user);
    void update(User user);
    void delete(Long id);
}
