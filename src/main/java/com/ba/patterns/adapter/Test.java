package com.ba.patterns.adapter;

public class Test {
    public static void main(String[] args) {

        Priz priz = new Priz();

        Utu utu = new Utu();
        Buzdolabı buzdolabı = new Buzdolabı();

        priz.eletrikVer(utu);
        priz.eletrikVer(buzdolabı);

        SamsungTelefon samsungTelefon = new SamsungTelefon();

        TelefonEEAAdapter adapter = new TelefonEEAAdapter(samsungTelefon);

        priz.eletrikVer(adapter);
    }
}
