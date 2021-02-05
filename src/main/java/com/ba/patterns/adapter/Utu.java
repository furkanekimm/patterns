package com.ba.patterns.adapter;

public class Utu implements ElektrikliEvAletleri {

    private int volt;

    public Utu(){
        this.volt = 220;
    }

    @Override
    public int prizeTakVeCalistir() {
        System.out.println("Ütü çalışıyor.");
        return volt;
    }
}
