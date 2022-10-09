package com.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Json
 */
public class Guava implements Cache {

    Map<Object, Object> map = new HashMap<>();

    @Override
    public void set(Object k, Object v) {
        System.out.println("Guava添加数据");
        map.put(k, v);
    }

    @Override
    public Object get(Object k) {
        System.out.println("Guava获取数据");
        return map.get(k);
    }
}
