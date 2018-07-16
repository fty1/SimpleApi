package com.fty1.simpleapi.ugi.utils;

import java.util.Iterator;

public class ObjectUtils {

    public static Boolean isNull(Object o){

        if(null == o){
            return true;
        }

        if(o instanceof Iterator){
            return ((Iterator) o).hasNext();
        }

        return false;
    }

}
