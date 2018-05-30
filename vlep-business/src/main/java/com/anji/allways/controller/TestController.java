package com.anji.allways.controller;

import com.anji.allways.common.aop.LoggerManage;
import com.anji.allways.common.entity.BaseResponseModel;
import com.anji.allways.service.TestService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import javax.annotation.Resource;

@RequestMapping("/test")
@RestController
public class TestController {
    @Resource
    private TestService testService;
    @Resource
    private JedisPool jedisPool;

    /**
     * 传入参数2可以测试异常
     * @param id 参数
     * @return 线路信息
     */
    @GetMapping("/{id}")
    @LoggerManage(description = "线路查询")
    public BaseResponseModel getLineById(@PathVariable("id") Long id) {
        return BaseResponseModel.ofSuccessData(testService.getLineById(id));
    }
    @GetMapping("/hello/{name}")
    public BaseResponseModel hello(@PathVariable("name")String name){
        return BaseResponseModel.ofSuccessMessage("Hello "+name);
    }
    @GetMapping("/redis")
    public BaseResponseModel redis(){
        Jedis jedis = jedisPool.getResource();
        jedis.set("测试","测试");
        String test=jedis.get("测试");
        jedis.close();
        return BaseResponseModel.ofSuccessData(test);
    }
}