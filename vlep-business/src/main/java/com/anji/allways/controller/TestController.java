package com.anji.allways.controller;

import com.anji.allways.common.entity.BaseResponseModel;
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
    public BaseResponseModel getLineById(@PathVariable("id") Long id) {
        return BaseResponseModel.ofSuccessData(testService.getLineById(id));
    }
    @GetMapping("/hello/{name}")
    public BaseResponseModel hello(@PathVariable("name")String name){
        return BaseResponseModel.ofSuccessMessage("Hello "+name);
    }
}