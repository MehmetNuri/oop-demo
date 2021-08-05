package com.uniyaz.yb;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Telefon t1 = new Telefon();
        t1.setAd("iPhone");
        t1.setEn("200");
        t1.setBoy("200");
        t1.setYukseklik("1");
        t1.setBataryaKapasitesi("3000");
        t1.setCiftHatDestegi(false);
        t1.setGsmTeknolojisi("5G");
        t1.setIslemciModeli("M1");
        t1.setIsletimSistemi("iOS");
        t1.setKameraCozunurlugu("12 mp");
        t1.setRam("4G");
        t1.setMarka("Apple");
        t1.setModel("11 Pro");
        t1.setSeri("65464ss5455");
        t1.setGucTuketimi("25V");


        BuzDolabi b1 = new BuzDolabi();
        b1.setAd("No Frost Buz Dolabı");
        b1.setMarka("Vestel");
        b1.setModel("4a5a4");
        b1.setEn("500");
        b1.setBoy("6006");
        b1.setYukseklik("652");
        b1.setBuzlukKonumu("Alt");
        b1.setKapiSayisi(2);
        b1.setHavalandirmaTeknolojisi("Gün ışığı");
        b1.setRafSayisi(5);

        Telefon ti = new Telefon();
        ti.aramaYapabilir();
        ti.inteneteGirebilir();
        ti.smsGonderebilir();


    }
}
