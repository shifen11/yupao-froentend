package com.shifen.usercenter.common;

import lombok.Data;

import javax.annotation.security.DenyAll;


public enum ErrorCode {
    SUCCESS(0, "OK", ""),
    PARAMS_ERROR(40000, "请求参数错误", ""),
    PARAMS_NULL_ERROR(40001, "请求数据错误", ""),
    NO_LOGIN(40100, "未登录", ""),
    NO_AUTH(40101, "无权限", ""),
    SYSTEM_ERROR(50000, "系统内部异常", ""),
  ;

    private final int code;
    private final String message;
    private final String description;

    ErrorCode(int code, String message, String description) {
        this.code = code;
        this.message = message;
        this.description = description;
    }
    public int getCode() {
        return code;
    }
    public String getMessage() {
        return message;
    }
    public String getDescription() {
        return description;
    }
}
