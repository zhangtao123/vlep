package com.anji.allways.service.impl;

import com.anji.allways.dao.LineMapper;
import com.anji.allways.entity.Line;
import com.anji.allways.service.TestService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service("testService")
public class TestServiceImpl implements TestService {
    @Resource
    private LineMapper lineMapper;
    @Override
    @Transactional(readOnly = true)
    public Line getLineById(Long id){
        return lineMapper.selectByPrimaryKey(id);
    }
}