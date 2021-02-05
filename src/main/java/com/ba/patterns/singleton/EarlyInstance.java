package com.ba.patterns.singleton;

public class EarlyInstance {
    private static EarlyInstance earlyInstance = new EarlyInstance();

    private EarlyInstance(){}

    public static EarlyInstance getEarlyInstance(){
        return earlyInstance;
    }

}
