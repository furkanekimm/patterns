package com.ba.patterns.adapter;

public class Priz {

    public void eletrikVer(ElektrikliEvAletleri elektrikliEvAletleri){
        int volt = elektrikliEvAletleri.prizeTakVeCalistir();
        System.out.println("Prizden" + volt + " vold alınıyor");
    }
}
