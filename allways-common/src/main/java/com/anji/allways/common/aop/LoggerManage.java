package com.anji.allways.common.aop;

import java.lang.annotation.*;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/5/30
 * Time: 13:11
 * To change this template use File | Settings | File Templates.
 * Description:
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoggerManage {
    String description();
}