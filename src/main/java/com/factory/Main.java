package com.factory;

/**
 * @author Json
 */
public class Main {
    public static void main(String[] args) {
        Cache proxy = JDKProxy.getProxy(new Guava());
        proxy.set("aa", "11");
        System.out.println(proxy.get("aa"));
    }
}
