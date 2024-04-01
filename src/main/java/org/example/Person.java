package org.example;

public abstract class Person {
    private String ad;
    private String soyad;
    private int yas;

    public Person(String ad, String soyad, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public abstract void introduceYourself();

    public boolean emekliMi() {
        if (this instanceof Erkek) {
            return yas >= 65;
        } else if (this instanceof Kadin) {
            return yas >= 60;
        } else {
            return false;
        }
    }
}


