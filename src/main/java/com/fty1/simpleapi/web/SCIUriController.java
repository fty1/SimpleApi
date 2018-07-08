package com.fty1.simpleapi.web;

import com.fty1.simpleapi.sci.jpa.entity.SCIUriEntity;
import com.fty1.simpleapi.sci.logic.service.SCIUriService;
import com.fty1.simpleapi.cci.http.Fty1RequestBodyBuilder;
import com.fty1.simpleapi.cci.http.Fty1ResponseBodyBuilder;
import com.fty1.simpleapi.cci.http.request.Fty1RequestBody;
import com.fty1.simpleapi.cci.http.response.Fty1ResponseBody;
import com.fty1.simpleapi.cci.runtime.result.RTResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/sci/uri")
public class SCIUriController {


    @Autowired
    private SCIUriService sciUriService;

    @RequestMapping(value = "/post")
    @ResponseBody
    public Fty1ResponseBody post(@RequestBody Fty1RequestBody<SCIUriEntity> req) {
        //TODO 拦截器处理
        if (!Fty1RequestBodyBuilder.isSuccess(req)) {
            return Fty1ResponseBodyBuilder.datanull();
        }
        RTResult<Boolean> res = sciUriService.save(req.getData());
        return Fty1ResponseBodyBuilder.buildByRTResult(res);
    }

}
