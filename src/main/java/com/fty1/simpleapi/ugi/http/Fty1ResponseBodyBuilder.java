package com.fty1.simpleapi.ugi.http;

import com.fty1.simpleapi.ugi.ResultConstant;
import com.fty1.simpleapi.ugi.http.response.Fty1ResponseBody;
import com.fty1.simpleapi.ugi.http.response.Fty1ResponsePageInfo;
import com.fty1.simpleapi.ugi.runtime.result.RTResult;
import com.fty1.simpleapi.ugi.runtime.result.RTResultPageInfo;

public class Fty1ResponseBodyBuilder {

    private static Fty1ResponseBody builder(Boolean success, String code, String msg, Object data,Fty1ResponsePageInfo pageInfo) {
        Fty1ResponseBody responseBody = new Fty1ResponseBody();
        responseBody.setSuccess(success);
        responseBody.setCode(code);
        responseBody.setMsg(msg);
        responseBody.setData(data);
        responseBody.setPageInfo(pageInfo);
        return responseBody;
    }

    public static Fty1ResponseBody success(){
        return builder(true, ResultConstant.SYS_CODE_SUCCESS,ResultConstant.SYS_MSG_SUCCESS,null,null);
    }

    public static Fty1ResponseBody failure(){
        return builder(false, ResultConstant.SYS_CODE_FAILUER,ResultConstant.SYS_MSG_FAILUER,null,null);
    }

    public static Fty1ResponseBody failure(Object data){
        return builder(false, ResultConstant.SYS_CODE_FAILUER,ResultConstant.SYS_MSG_FAILUER,data,null);
    }

    public static Fty1ResponseBody datanull() {
        return builder(false, ResultConstant.SYS_CODE_FAILUER,"数据为空",null,null);
    }

    public static Fty1ResponseBody buildByRTResult(RTResult<Boolean> res) {

        if(null == res){
            return datanull();
        }
        RTResultPageInfo pageInfo = res.getPage();
        if(null == pageInfo){
            return builder(res.getSuccess(),res.getCode(),res.getMsg(),res.getData(),null);
        }
        Fty1ResponsePageInfo fty1ResponsePageInfo = Fty1ResponsePageInfoBuilder.buildByRTResult(pageInfo);
        return builder(res.getSuccess(),res.getCode(),res.getMsg(),res.getData(),fty1ResponsePageInfo);
    }
}
