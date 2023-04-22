package com.itheima.exception;

/**
 * 系统异常类
 * @author :liangyuhang1
 * @className :SystemException
 * @date :2023/3/22/22:20
 */
public class SystemException extends RuntimeException {
    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public SystemException(int code) {
        this.code = code;
    }

    public SystemException(int code, String message) {
        super(message);
        this.code = code;
    }

    public SystemException(int code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }


}
