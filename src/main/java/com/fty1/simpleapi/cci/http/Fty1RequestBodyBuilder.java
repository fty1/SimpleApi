package com.fty1.simpleapi.cci.http;

import com.fty1.simpleapi.cci.http.request.Fty1RequestBody;

public class Fty1RequestBodyBuilder {


    public static Boolean isSuccess(Fty1RequestBody fty1ResponseBody) {

        if (null == fty1ResponseBody) {
            return false;
        }

        return (null != fty1ResponseBody.getData());
    }

}
