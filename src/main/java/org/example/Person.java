package org.example;
import java.time.LocalDate;

public class Person {
    private String ad;
    private String soyad;
    private String dogumTarihi;

    public Person(String ad, String soyad, String dogumTarihi) {
        this.ad = ad;
        this.soyad = soyad;
        this.dogumTarihi = dogumTarihi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public String getDogumTarihi() {
        return dogumTarihi;
    }

    public void setDogumTarihi(String dogumTarihi) {
        this.dogumTarihi = dogumTarihi;
    }

    public int emeklilikYasi() {
        return 0; // Genel olarak emeklilik yaşı sıfır olarak döndürülür, alt sınıflarda geçersiz kılınacak
    }

    public String toString() {
        return ad + " " + soyad; // Person nesnesinin ad ve soyadını döndürür
    }


}

