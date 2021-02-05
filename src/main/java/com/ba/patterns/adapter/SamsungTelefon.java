package com.ba.patterns.adapter;

public class SamsungTelefon  implements  Telefon{

    private int calismaVoltaji;

    public SamsungTelefon(){
        this.calismaVoltaji = 5;
    }

    @Override
    public int sarjEt() {
       System.out.println("Samsung telefon çalışıyor.");
       return calismaVoltaji;
    }
}
