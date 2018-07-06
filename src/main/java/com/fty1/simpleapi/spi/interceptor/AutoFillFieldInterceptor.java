package com.fty1.simpleapi.spi.interceptor;

import com.alibaba.fastjson.JSON;
import com.fty1.simpleapi.uci.generator.id.IncrementIdGenerator;
import com.fty1.simpleapi.ugi.utils.ObjectUtils;
import org.hibernate.EmptyInterceptor;
import org.hibernate.type.Type;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.Date;

public class AutoFillFieldInterceptor extends EmptyInterceptor {
    private static final long serialVersionUID = 2470573405278076086L;

    private Logger logger = LoggerFactory.getLogger(AutoFillFieldInterceptor.class);

    @Override
    public void onDelete(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        logger.info(JSON.toJSONString(entity));
    }

    @Override
    public boolean onFlushDirty(Object entity, Serializable id, Object[] currentState, Object[] previousState, String[] propertyNames, Type[] types) {
        logger.info(JSON.toJSONString(entity));
        return true;
    }

    @Override
    public boolean onLoad(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        logger.info(JSON.toJSONString(entity));
        return true;
    }

    @Override
    public boolean onSave(Object entity, Serializable id, Object[] state, String[] propertyNames, Type[] types) {
        if (entity instanceof IncrementIdGenerator) {
            Date date = new Date();
            if (ObjectUtils.isNull(((IncrementIdGenerator) entity).getCtime())) {
                ((IncrementIdGenerator) entity).setCtime(date);
            }
            if (ObjectUtils.isNull(((IncrementIdGenerator) entity).getUtime())) {
                ((IncrementIdGenerator) entity).setUtime(date);
            }

            if (ObjectUtils.isNull(((IncrementIdGenerator) entity).getCuuid())) {
                ((IncrementIdGenerator) entity).setCuuid(0L);
            }

            if (ObjectUtils.isNull(((IncrementIdGenerator) entity).getUuuid())) {
                ((IncrementIdGenerator) entity).setUuuid(0L);
            }
        }
        logger.info(JSON.toJSONString(entity));
        return true;
    }
}
