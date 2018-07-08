package com.fty1.simpleapi.cci.runtime.result;

import com.fty1.simpleapi.cci.ResultConstant;

import java.io.Serializable;

public class RTResultBuilder {

    private static RTResult builder(Boolean success, String code, String msg, Serializable data, RTResultPageInfo page) {
        RTResult result = new RTResult();
        result.setSuccess(success);
        result.setCode(code);
        result.setMsg(msg);
        result.setData(data);
        result.setPage(page);
        return result;
    }

    public static RTResult success() {
        return builder(true, ResultConstant.SYS_CODE_SUCCESS, ResultConstant.SYS_MSG_SUCCESS, null, null);
    }

    public static RTResult failure() {
        return builder(false, ResultConstant.SYS_CODE_FAILUER, ResultConstant.SYS_MSG_FAILUER, null, null);
    }

    public static RTResult throwable() {
        return builder(false, ResultConstant.SYS_CODE_THROWABLE, ResultConstant.SYS_MSG_THROWABLE, null, null);
    }


    public static Boolean isSuccess(RTResult result) {

        if (null == result) {
            return false;
        }

        return result.getSuccess();
    }

}
