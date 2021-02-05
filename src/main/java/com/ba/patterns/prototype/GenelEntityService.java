package com.ba.patterns.prototype;

public class GenelEntityService {
    public BelgeTuru findBelgeTuruById(Long id){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        BelgeTuru belgeTuru = new BelgeTuru();
        belgeTuru.setId(id);

        String adi;
        if(id.compareTo(1L) == 0){
            adi = "Kişisel";
        }else if(id.compareTo(2L) == 0){
            adi = "Kurumsal";
        }else{
            adi = "Genel";
        }
        belgeTuru.setName(adi);

        return belgeTuru;
    }

    public Categori findCategoriById(Long id){
        try{
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Categori categori = new Categori();
        categori.setId(id);

        String adi;
        if(id.compareTo(1L) == 0){
            adi = "Özel";
        }else if(id.compareTo(2L) == 0){
            adi = "İş";
        }else{
            adi = "Genel";
        }
        categori.setName(adi);

        return categori;
    }

    public Belge findBelgeById(Long id){
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Belge belge = new Belge();
        belge.setId(id);
        belge.setBelgeTuru(findBelgeTuruById(id));
        belge.setCategori(findCategoriById(id));


        String adi;
        String veri;
        if(id.compareTo(1L) == 0){
            adi = "Özel";
            veri = "Sevgili dostum Ahmet ...";
        }else if(id.compareTo(2L) == 0){
            adi = "İş";
            veri = "Bu rapor müdüre verilmek üzere hazırlanmıştır.";
        }else{
            adi = "Genel";
            veri = "Yayalara yol ver...!";
        }
        belge.setName(adi);
        belge.setVeri(veri);

        return belge;
    }
}
