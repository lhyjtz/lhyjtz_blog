package com.lcyjtz;

public enum ResultInfo {
    ACCESS_DENY("403", "权限不足"),
    LOGIN_SUCCESS("200", "登录成功"),
    LOGIN_ERROR("401", "登录失败"),
    GLOBAL_ERROR("101", "系统繁忙"),
    NOT_FOUND("404", "没有找到"),
    SUCCESS("200", "操作成功");
    private String code;
    private String message;

    ResultInfo(String code, String message) {
        this.code = code;
        this.message = message;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
