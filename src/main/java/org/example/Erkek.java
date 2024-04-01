package org.example;


public class Erkek extends Person {
    public Erkek(String ad, String soyad, int yas) {
        super(ad, soyad, yas);
    }

    @Override
    public void introduceYourself() {
        System.out.println("Ben bir erkeğim. Adım " + getAd() + " " + getSoyad() + ". Yaşım " + getYas());
    }
    @Override
    public boolean emekliMi() {
        // Kadınlar için emeklilik yaşı 60
        return getYas() >= 65;
    }
}


