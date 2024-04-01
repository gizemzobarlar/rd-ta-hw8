package org.example;


public class Kadin extends Person {
    public Kadin(String ad, String soyad, int yas) {
        super(ad, soyad, yas);
    }

    @Override
    public void introduceYourself() {
        System.out.println("Ben bir kadınım. Adım " + getAd() + " " + getSoyad() + ". Yaşım " + getYas());
    }

    @Override
    public boolean emekliMi() {
        // Kadınlar için emeklilik yaşı 60
        return getYas() >= 60;
    }
}

