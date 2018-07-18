package com.fty1.simpleapi.web;

import com.fty1.simpleapi.cci.http.Fty1ResponseBodyBuilder;
import com.fty1.simpleapi.cci.http.response.Fty1ResponseBody;
import com.fty1.simpleapi.sci.jpa.entity.SCIUriEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
public class YController {

    @RequestMapping("/")
    @ResponseBody
    public Fty1ResponseBody index(){
        return Fty1ResponseBodyBuilder.success();
    }
//
//    @RequestMapping("/error")
//    @ResponseBody
//    public Fty1ResponseBody error(){
//        return Fty1ResponseBodyBuilder.failure();
//    }



}
