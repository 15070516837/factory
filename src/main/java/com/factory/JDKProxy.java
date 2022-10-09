package com.factory;

import java.lang.reflect.Proxy;

/**
 * @author Json
 */
public final class JDKProxy {

    public static <T> T getProxy(Cache cacheAdapter) {
        return (T) Proxy.newProxyInstance(cacheAdapter.getClass().getClassLoader(),
                new Class[]{Cache.class}, new JDKInvocationHandler(cacheAdapter));
    }

}
