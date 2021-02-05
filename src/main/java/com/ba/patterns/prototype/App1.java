package com.ba.patterns.prototype;

import java.util.Date;

public class App1 {
    public static void main(String[] args) throws CloneNotSupportedException {
        GenelEntityService genelEntityService = new GenelEntityService();

        Date ilkTarih = new Date();
        Belge belge1 = genelEntityService.findBelgeById(1L);
        belgeVeSaniyeFarkiniYazdir(ilkTarih, belge1);

        Date ilkTarih2 = new Date();
        Belge belge2 = genelEntityService.findBelgeById(2L);
        belgeVeSaniyeFarkiniYazdir(ilkTarih2, belge2);


        //Bu durumda tek problem shallow copy yapmasıdır.
        Date ilkTarih3 = new Date();
        Belge belgeClone = belge1.clone();
        belgeClone.setName("Günlük");
        belgeClone.setVeri("sEVGİLİ GÜNLÜK");
        belgeClone.getBelgeTuru().setName("Kişisel 2");
        belgeVeSaniyeFarkiniYazdir(ilkTarih3,belgeClone);

        System.out.println(belge1);
    }

    private static void belgeVeSaniyeFarkiniYazdir(Date ilkTarih, Belge belge1) {
        Date sonTarih = new Date();

        Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);

        System.out.println(belge1);
        System.out.println(saniyeFarki);
    }

    private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih){
        Long has = 1000L;

        Long saniyeFarki = (sonTarih.getTime() / has) - (ilkTarih.getTime() / has);

        return saniyeFarki;
    }
}
