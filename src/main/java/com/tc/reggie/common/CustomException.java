package com.tc.reggie.common;

/**
 * 自定义业务异常处理器
 */
public class CustomException extends  RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
