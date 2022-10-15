package com.hf.usercenter.exception;

import com.hf.usercenter.common.ErrorCode;

/**
 * 自定义异常类
 */
public class BusinessException extends RuntimeException{

    private final String description;

    private final int code;

    public BusinessException(String message, String description, int code) {
        super(message);
        this.description = description;
        this.code = code;
    }

    public BusinessException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.description = errorCode.getDescription();
        this.code = errorCode.getCode();
    }

    public BusinessException(ErrorCode errorCode, String description) {
        super(errorCode.getMessage());
        this.description = description;
        this.code = errorCode.getCode();
    }

    public String getDescription() {
        return description;
    }

    public int getCode() {
        return code;
    }
}
