package com.crud1.demo.FE.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/fe/users")
@RequiredArgsConstructor
public class ApiController {

    private final RestTemplate restTemplate;

    @GetMapping
    public Object getUsers() {
        return restTemplate.getForObject("http://localhost:8081/be/users", Object.class);
    }
}
