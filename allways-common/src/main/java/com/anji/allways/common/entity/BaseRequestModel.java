package com.anji.allways.common.entity;

import com.alibaba.fastjson.JSONObject;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/5/30
 * Time: 12:00
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class BaseRequestModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String token;

    private String userId;

    private String sign;

    private String time;

    private JSONObject reqData;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUserId() {
        if (null != this.userId) {
            return userId;
        }
        if (null == this.token || 0 == this.token.length() || !this.token.contains("_")) {
            this.token = "111_xxxxx";
        }
        String[] tokenInfo = this.token.split("_");
        if (tokenInfo.length != 2) {
            return null;
        }
        this.userId = tokenInfo[0];
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public JSONObject getReqData() {
        return reqData;
    }

    public void setReqData(JSONObject reqData) {
        this.reqData = reqData;
    }
}