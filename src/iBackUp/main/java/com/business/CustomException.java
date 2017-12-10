package com.business;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe 自定义异常类
 * @since 2017/11/20
 **/
public class CustomException extends Exception
{
    public CustomException(String message)
    {
        super(message);
    }
}
