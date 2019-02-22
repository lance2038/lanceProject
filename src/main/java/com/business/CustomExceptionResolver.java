package com.business;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author lance
 * @version v0.0.1
 * @project lanceProject
 * @describe 全局异常处理
 * @since 2017/11/20
 **/
public class CustomExceptionResolver implements HandlerExceptionResolver
{

    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e)
    {
        CustomException customException = null;
        if (e instanceof CustomException)
        {
            customException = (CustomException) e;
        }
        else
        {
            customException = new CustomException("未知错误");
        }
        String message = customException.getMessage();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message", message);
        modelAndView.setViewName("error/error");
        return modelAndView;
    }
}
