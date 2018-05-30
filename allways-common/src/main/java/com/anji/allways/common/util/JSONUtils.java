package com.anji.allways.common.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JSONUtils {
    private static ObjectMapper objectMapper = new ObjectMapper();

    /**
     * Java对象转Json字符串
     *
     * @param object 传入Java对象
     * @return 返回Json字符串
     */
    public static String toJson(Object object) {
        try {
            return objectMapper.writeValueAsString(object);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Json字符串转Java对象
     *
     * @param string 待转换的Json字符串
     * @param type   目标Java类型
     * @param <T>    返回的Java对象类型
     * @return 一个Java对象
     */
    public static <T> T toObject(String string, Class<T> type) {
        try {
            return objectMapper.readValue(string, type);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Json字符串转List
     *
     * @param string        待转换的Json字符串
     * @param typeReference 目标Java List范型类型 写法为: new TypeReference(List<Dealer>)
     * @param <T>           返回的Java对象类型
     * @return 一个JavaList对象
     */
    public static <T> T toList(String string, TypeReference<T> typeReference) {
        try {
            return objectMapper.readValue(string, typeReference);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}