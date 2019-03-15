package com.example.boottest.util;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

import static org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR;

/**
 * @Description: java类作用描述
 * @Author: zhangtao
 * @CreateDate: 2019/2/19 14:03
 * @Version: 1.0
 */
@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    public ResponseBean<Void> exceptionHandler(HttpServletRequest request, Exception e){
        e.printStackTrace();
        int statusCode = getStatus(request);
        return new ResponseBean<>(statusCode,e.getMessage());
    }


    private Integer getStatus(HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        if (statusCode == null) {
            return INTERNAL_SERVER_ERROR.value();
        }
        return statusCode;
    }
}
