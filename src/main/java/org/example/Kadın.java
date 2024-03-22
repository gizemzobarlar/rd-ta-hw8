package org.example;


public class Kadın extends Person {
    public Kadın(String ad, String soyad, String dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasi() {
        return 60;
    }
}
