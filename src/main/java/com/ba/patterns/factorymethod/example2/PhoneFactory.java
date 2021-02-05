package com.ba.patterns.factorymethod.example2;

public class PhoneFactory {
    public static Phone getPhone(String model){
        Phone phone;
        if("s8".equalsIgnoreCase(model)){
            phone = new S8();
        }
        else if("note8".equalsIgnoreCase(model)){
            phone = new Note8();
        }
        else{
            throw new RuntimeException("Don't have this item");
        }
        return phone;
    }
}
