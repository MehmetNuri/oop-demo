package com.uniyaz.yb;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Telefon extends Cihaz implements ITelefon {

    private String isletimSistemi;
    private String bataryaKapasitesi;
    private String kameraCozunurlugu;
    private String ram;
    private String islemciModeli;
    private Boolean ciftHatDestegi;
    private String gsmTeknolojisi;
    private String model;

    public String getIsletimSistemi() {
        return isletimSistemi;
    }

    public void setIsletimSistemi(String isletimSistemi) {
        this.isletimSistemi = isletimSistemi;
    }

    public String getBataryaKapasitesi() {
        return bataryaKapasitesi;
    }

    public void setBataryaKapasitesi(String bataryaKapasitesi) {
        this.bataryaKapasitesi = bataryaKapasitesi;
    }

    public String getKameraCozunurlugu() {
        return kameraCozunurlugu;
    }

    public void setKameraCozunurlugu(String kameraCozunurlugu) {
        this.kameraCozunurlugu = kameraCozunurlugu;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getIslemciModeli() {
        return islemciModeli;
    }

    public void setIslemciModeli(String islemciModeli) {
        this.islemciModeli = islemciModeli;
    }

    public Boolean getCiftHatDestegi() {
        return ciftHatDestegi;
    }

    public void setCiftHatDestegi(Boolean ciftHatDestegi) {
        this.ciftHatDestegi = ciftHatDestegi;
    }

    public String getGsmTeknolojisi() {
        return gsmTeknolojisi;
    }

    public void setGsmTeknolojisi(String gsmTeknolojisi) {
        this.gsmTeknolojisi = gsmTeknolojisi;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void aramaYapabilir() {
        System.out.println("ARAMA YAPABİLİR");
    }

    @Override
    public void inteneteGirebilir() {
        System.out.println("INTERNETE GIREBILIR");
    }

    @Override
    public void smsGonderebilir() {
        System.out.println("SMS GONDEREBILIR");
    }
}
