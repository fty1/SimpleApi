package com.fty1.simpleapi.gci.handler;

import com.fty1.simpleapi.cci.http.Fty1ResponseBodyBuilder;
import com.fty1.simpleapi.cci.http.response.Fty1ResponseBody;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Fty1ResponseBody exceptionHandler(Exception e){
        return Fty1ResponseBodyBuilder.system(e);
    }

}
