package com.fty1.simpleapi.spi.handler;

import com.fty1.simpleapi.ugi.http.Fty1ResponseBodyBuilder;
import com.fty1.simpleapi.ugi.http.response.Fty1ResponseBody;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Fty1ResponseBody globalExceptionHandler(Exception e) {
        return Fty1ResponseBodyBuilder.system(e);
    }
}
