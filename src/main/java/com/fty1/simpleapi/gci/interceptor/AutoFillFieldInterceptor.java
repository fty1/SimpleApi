package com.fty1.simpleapi.gci.interceptor;

import com.fty1.simpleapi.sci.jpa.entity.SCIUriEntity;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;

import java.io.Serializable;
import java.util.Date;

public class AutoFillFieldInterceptor extends EmptyInterceptor {
    private static final long serialVersionUID = 585415378523663844L;

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {

        if(entity instanceof SCIUriEntity){
            ((SCIUriEntity) entity).setCtime(new Date());
        }

        return false;
    }
}
