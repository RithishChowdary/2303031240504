package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.MiddlewareRepository;
import com.example.demo.service.MiddleWareService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import java.util.List;

@RestController
@RequestMapping("/dipots")
public class MiddleWare {

    private MiddleWareService middlewareservice;

    public MiddleWare(MiddleWareService middlewareservice) {
        this.middlewareservice = middlewareservice;
    }

    @PostMapping("/depots")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }
    
    @GetMapping("/depots")
    public List<MiddlewareRepository> getAllMiddleWare() {
        return middlewareservice.getAllMiddleWare();
    }


}
