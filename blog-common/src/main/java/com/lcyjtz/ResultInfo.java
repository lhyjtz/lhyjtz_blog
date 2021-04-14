package com.lcyjtz;

public enum ResultInfo {
    ACCESS_DENY("403", "您的权限不足"),
    LOGIN_SUCCESS("200", "登录成功"),
    LOGIN_ERROR("401", "登录失败,请检查密码账号是否正确以及确认是否满足登录需求"),
    GLOBAL_ERROR("101", "系统繁忙"),
    NOT_FOUND("404", "没有找到"),
    SUCCESSFULLY_DELETE("200", "删除成功"),
    DELETE_FAILED("400", "删除失败"),
    SUCCESS("200", "操作成功"),
    ADD_ERROR("400", "添加失败"),
    UPDATE_ERROR("400", "添加失败");

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
