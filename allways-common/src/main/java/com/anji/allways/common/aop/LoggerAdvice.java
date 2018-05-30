package com.anji.allways.common.aop;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/5/30
 * Time: 13:13
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Aspect
@Service
public class LoggerAdvice {
    private static final Logger LOGGER = LoggerFactory.getLogger(LoggerAdvice.class);

    @Before("within(com.anji.allways..*) && @annotation(loggerManage)")
    public void addBeforeLogger(JoinPoint joinPoint, LoggerManage loggerManage) {
        LOGGER.info("执行:[{}]开始", loggerManage.description());
        LOGGER.info("获取方法签名:[{}]", joinPoint.getSignature().toString());
        LOGGER.info("传入参数:[{}]", parseParams(joinPoint.getArgs()));
    }

    @AfterReturning("within(com.anji.allways..*) && @annotation(loggerManage)")
    public void addAfterReturningLogger(LoggerManage loggerManage) {
        LOGGER.info("执行:[{}]结束", loggerManage.description());
    }

    @AfterThrowing(pointcut = "within(com.anji.allways..*) && @annotation(loggerManage)", throwing = "ex")
    public void addAfterThrowingLogger(LoggerManage loggerManage, Exception ex) {
        LOGGER.error("执行:[{}]发生异常", loggerManage.description(), ex);
    }

    private String parseParams(Object[] params) {
        if (null == params || params.length <= 0) {
            return "";
        }
        StringBuilder param = new StringBuilder();
        for (Object obj : params) {
            param.append(ToStringBuilder.reflectionToString(obj)).append(" ");
        }
        return param.toString();
    }
}