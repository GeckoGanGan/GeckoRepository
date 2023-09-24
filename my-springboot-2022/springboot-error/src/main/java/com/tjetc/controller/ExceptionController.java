package com.tjetc.controller;

import com.tjetc.entity.ExceptionMessage;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(ArithmeticException.class)
    @ResponseBody
    //发生除0异常时，会执行该方法
    public ExceptionMessage arithmeticException(Exception e){
        ExceptionMessage exceptionMessage=new ExceptionMessage();
        exceptionMessage.setCode("500");
        exceptionMessage.setMessage(e.getMessage());
        return exceptionMessage;
    }
    //发生空指针异常时，会执行该方法
    @ExceptionHandler(NullPointerException.class)
    @ResponseBody
    public ExceptionMessage nullPointerException(Exception e){
        ExceptionMessage exceptionMessage=new ExceptionMessage();
        exceptionMessage.setCode("500");
        exceptionMessage.setMessage(e.getMessage());
        return exceptionMessage;
    }
    //发生其他位置异常时，会执行该方法
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public ExceptionMessage OtherException(Exception e){
        ExceptionMessage exceptionMessage=new ExceptionMessage();
        exceptionMessage.setCode("500");
        exceptionMessage.setMessage("发生了其他未知异常"+e.getMessage());
        return exceptionMessage;
    }


}

