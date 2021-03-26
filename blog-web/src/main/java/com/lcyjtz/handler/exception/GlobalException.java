package com.lcyjtz.handler.exception;

import com.lcyjtz.Result;
import com.lcyjtz.ResultInfo;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalException {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exception(Exception exception) {
        exception.printStackTrace();
        return Result.error().codeAndMessage(ResultInfo.GLOBAL_ERROR);
    }
    @ExceptionHandler(CustomException.class)
    @ResponseBody
    public Result customException(CustomException exception) {
        exception.printStackTrace();
        return Result.error().codeAndMessage(exception.getCode(), exception.getMessage());
    }
}
