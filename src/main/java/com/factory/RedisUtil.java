package com.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Json
 */
public class RedisUtil implements Cache {

    Map<Object, Object> map = new HashMap<>();

    @Override
    public void set(Object k, Object v) {
        System.out.println("redis添加数据");
        map.put(k, v);
    }

    @Override
    public Object get(Object k) {
        System.out.println("redis获取数据");
        return map.get(k);
    }
}
