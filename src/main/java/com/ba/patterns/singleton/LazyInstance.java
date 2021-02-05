package com.ba.patterns.singleton;

public class LazyInstance {
    private static LazyInstance lazyInstance;

    private LazyInstance(){}

    public static LazyInstance getLazyInstance(){
        if(lazyInstance == null){
            lazyInstance = new LazyInstance();
        }
        return lazyInstance;
    }
}
