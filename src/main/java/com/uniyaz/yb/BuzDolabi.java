package com.uniyaz.yb;

public class BuzDolabi extends Cihaz {

    private int rafSayisi;
    private int kapiSayisi;
    private String havalandirmaTeknolojisi;
    private String buzlukKonumu;
    private String model;

    public BuzDolabi() {
    }

    public BuzDolabi(int rafSayisi, int kapiSayisi, String havalandirmaTeknolojisi, String buzlukKonumu, String model) {
        this.rafSayisi = rafSayisi;
        this.kapiSayisi = kapiSayisi;
        this.havalandirmaTeknolojisi = havalandirmaTeknolojisi;
        this.buzlukKonumu = buzlukKonumu;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRafSayisi() {
        return rafSayisi;
    }

    public void setRafSayisi(int rafSayisi) {
        this.rafSayisi = rafSayisi;
    }

    public int getKapiSayisi() {
        return kapiSayisi;
    }

    public void setKapiSayisi(int kapiSayisi) {
        this.kapiSayisi = kapiSayisi;
    }

    public String getHavalandirmaTeknolojisi() {
        return havalandirmaTeknolojisi;
    }

    public void setHavalandirmaTeknolojisi(String havalandirmaTeknolojisi) {
        this.havalandirmaTeknolojisi = havalandirmaTeknolojisi;
    }

    public String getBuzlukKonumu() {
        return buzlukKonumu;
    }

    public void setBuzlukKonumu(String buzlukKonumu) {
        this.buzlukKonumu = buzlukKonumu;
    }

    @Override
    public String toString() {
        return "BuzDolabi{" +
                "rafSayisi=" + rafSayisi +
                ", kapiSayisi=" + kapiSayisi +
                ", havalandirmaTeknolojisi='" + havalandirmaTeknolojisi + '\'' +
                ", buzlukKonumu='" + buzlukKonumu + '\'' +
                '}';
    }
}
