package com.factory;


/**
 * @author Json
 */
public interface Cache {

    /**
     * 设置数据
     *
     * @param k
     * @param v
     */
    void set(Object k, Object v);

    /**
     * 获取对应数据
     *
     * @param k
     * @return
     */
    Object get(Object k);

}
