package com.factory;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Json
 */
public class JDKInvocationHandler implements InvocationHandler {

    private Cache cache;

    public JDKInvocationHandler(Cache cache) {
        this.cache = cache;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(cache, args);
    }
}
