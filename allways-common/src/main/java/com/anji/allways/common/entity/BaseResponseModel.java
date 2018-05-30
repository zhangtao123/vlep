package com.anji.allways.common.entity;

import org.springframework.http.HttpStatus;

import java.io.Serializable;

import static org.springframework.http.HttpStatus.OK;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/5/30
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class BaseResponseModel<T> implements Serializable {

    private static final long serialVersionUID = 1991015577868168856L;

    private Integer repCode;

    private String repMsg;

    private T repData;

    /**
     * 返回那些需要有返回值内容的情况，比如查询，把查询语句放入repData即可
     *
     * @param repData 返回值内容
     * @return 标准响应体
     */
    public static BaseResponseModel ofSuccessData(Object repData) {
        return new BaseResponseModel<>(OK.value(), OK.getReasonPhrase(), repData);
    }

    /**
     * 返回只需要一个成功消息的时候，比如提示新增成功，修改成功
     *
     * @param repMsg 消息体
     * @return 标准响应体
     */
    public static BaseResponseModel ofSuccessMessage(String repMsg) {
        return new BaseResponseModel<>(OK.value(), repMsg, null);
    }

    /**
     * 返回一个项目自定义http状态码（业务枚举类Status里有的）。通常用于处理异常，返回前台一个错误信息
     *
     * @param status Http状态码
     * @return 标准响应体
     */
    public static BaseResponseModel ofStatus(Status status) {
        return new BaseResponseModel<>(status.getCode(), status.getReasonPhrase(), null);
    }

    /**
     * 返回一个Spring官方标准http状态码（业务枚举类Status里有的）。通常用于处理异常，返回前台一个错误信息
     *
     * @param httpStatus Http状态码
     * @return 标准响应体
     */
    public static BaseResponseModel ofHttpStatus(HttpStatus httpStatus) {
        return new BaseResponseModel<>(httpStatus.value(), httpStatus.getReasonPhrase(), null);
    }

    /**
     * 返回一个标准http状态码（枚举类Status里没有的）。通常用于处理异常，返回前台一个错误信息
     *
     * @param repCode 状态码
     * @param repMsg  状态信息
     * @return 标准响应体
     */
    public static BaseResponseModel ofFailedStatus(Integer repCode, String repMsg) {
        return new BaseResponseModel<>(repCode, repMsg, null);
    }

    public BaseResponseModel() {
        this.repCode = OK.value();
        this.repMsg = OK.getReasonPhrase();
    }

    public BaseResponseModel(Integer repCode, String repMsg, T repData) {
        this.repCode = repCode;
        this.repMsg = repMsg;
        this.repData = repData;
    }

    public Integer getRepCode() {
        return repCode;
    }

    public void setRepCode(Integer repCode) {
        this.repCode = repCode;
    }

    public String getRepMsg() {
        return repMsg;
    }

    public void setRepMsg(String repMsg) {
        this.repMsg = repMsg;
    }

    public T getRepData() {
        return repData;
    }

    public void setRepData(T repData) {
        this.repData = repData;
    }
}