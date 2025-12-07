package com.crud1.demo.BE.controller;

import com.crud1.demo.BE.domain.User;
import com.crud1.demo.BE.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/be/users")
public class UserController {
    private final UserService userService;

    @GetMapping
    public List<User> getAll(){
        return userService.getAll();
    }

    @GetMapping("/{id}")
    public User getById(@PathVariable Long id){
        return userService.getById(id);
    }

    @PostMapping
    public void create(@RequestBody User user){
        userService.create(user);
    }

    @PutMapping
    public void update(@RequestBody User user){
        userService.update(user);
    }

    @DeleteMapping
    public void delete(@PathVariable Long id){
        userService.delete(id);
    }

}
