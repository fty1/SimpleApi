package com.fty1.simpleapi.uci.generator;

import java.io.Serializable;
import java.util.Date;

public interface AutoFillField extends Serializable {


    /**
     * 创建人
     */
    Serializable cuuid();

    /**
     * 创建时间
     */
    Date ctime();

    /**
     * 更新人
     */
    Serializable uuuid();

    /**
     * 更新时间
     */
    Date utime();


    Long version();
}
