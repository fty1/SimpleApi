package com.fty1.simpleapi.web;

import com.fty1.simpleapi.sci.jpa.entity.SCIUriEntity;
import com.fty1.simpleapi.sci.logic.service.SCIUriService;
import com.fty1.simpleapi.ugi.http.Fty1RequestBodyBuilder;
import com.fty1.simpleapi.ugi.http.Fty1ResponseBodyBuilder;
import com.fty1.simpleapi.ugi.http.request.Fty1RequestBody;
import com.fty1.simpleapi.ugi.http.response.Fty1ResponseBody;
import com.fty1.simpleapi.ugi.runtime.result.RTResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@Controller
@RequestMapping("/sci/uri")
public class SCIUriController {


    @Autowired
    private SCIUriService sciUriService;

    @RequestMapping(value = "/post", method = RequestMethod.POST)
    @ResponseBody
    public Fty1ResponseBody post(@RequestBody Fty1RequestBody<SCIUriEntity> req) {
        if (!Fty1RequestBodyBuilder.isSuccess(req)) {
            return Fty1ResponseBodyBuilder.datanull();
        }
        RTResult<Boolean> res = sciUriService.save(req.getData());
        return Fty1ResponseBodyBuilder.buildByRTResult(res);
    }

}
