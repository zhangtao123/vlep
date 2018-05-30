package com.anji.allways.service.impl;

import com.anji.allways.dao.LineMapper;
import com.anji.allways.entity.Line;
import com.anji.allways.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    private LineMapper lineMapper;

    @Override
    @Transactional(readOnly = true)
    public Line getLineById(Long id) {
        Assert.isTrue(id != 2, "测试全局异常捕获");
        return lineMapper.selectByPrimaryKey(id);
    }
}