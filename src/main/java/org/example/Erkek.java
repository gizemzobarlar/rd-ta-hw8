package org.example;


public class Erkek extends Person {
    public Erkek(String ad, String soyad, String dogumTarihi) {
        super(ad, soyad, dogumTarihi);
    }

    @Override
    public int emeklilikYasi() {
        return 65;
    }
}


