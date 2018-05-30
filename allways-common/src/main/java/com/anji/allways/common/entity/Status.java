package com.anji.allways.common.entity;

/**
 * 返回错误状态码以及信息，作为HttpStatus的补充
 * 后期根据业务需求扩充
 * @author yibo
 */
public enum Status {
    NOT_VALID_PARAMS(40005, "Not Valid Params"),
    NOT_SUPPORTED_OPERATION(40006, "Not Supported Operation"),
    NOT_LOGIN(50000, "Not Login");

    private Integer code;
    private String reasonPhrase;

    Status(Integer code, String reasonPhrase) {
        this.code = code;
        this.reasonPhrase = reasonPhrase;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getReasonPhrase() {
        return reasonPhrase;
    }

    public void setReasonPhrase(String reasonPhrase) {
        this.reasonPhrase = reasonPhrase;
    }
}