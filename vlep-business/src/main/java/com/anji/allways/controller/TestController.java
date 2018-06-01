package com.anji.allways.controller;

import com.anji.allways.common.aop.LoggerManage;
import com.anji.allways.common.entity.BaseResponseModel;
import com.anji.allways.service.TestService;
import org.springframework.web.bind.annotation.*;
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
    @PostMapping("/redis")
    @LoggerManage(description = "redis测试")
    public BaseResponseModel redis(){
        Jedis jedis = null;
        try {
            jedis = jedisPool.getResource();
            jedis.set("测试", "测试");
            String test = jedis.get("测试");
            return BaseResponseModel.ofSuccessData(test);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            if (jedis!=null){
                jedis.close();
            }
        }
        return null;
    }
}