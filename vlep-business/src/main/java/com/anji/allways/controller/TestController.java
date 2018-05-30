package com.anji.allways.controller;

import com.anji.allways.entity.Line;
import com.anji.allways.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/test")
@RestController
public class TestController {
    @Resource
    private TestService testService;

    @GetMapping("/{id}")
    public Line getLineById(@PathVariable("id") Long id) {
        return testService.getLineById(id);
    }
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name")String name){
        return "Hello "+name;
    }
}