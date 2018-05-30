package com.anji.allways.common.entity;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: User
 * Date: 2018/5/30
 * Time: 12:02
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class BaseResponseModel <T> implements Serializable {

    private static final long serialVersionUID = 1991015577868168856L;

    private String            repCode;

    private String            repMsg;

    private T                 repData;

    public String getRepCode() {
        return repCode;
    }

    public void setRepCode(String repCode) {
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