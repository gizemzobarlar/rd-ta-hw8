package org.example;

public class Main {
    public static void main(String[] args) {
        Erkek teamLead = new Erkek("Osman", "Hak", 45);
        Departman departman = new Departman(teamLead);

        Person personel1 = new Erkek("Ahmet", "Yılmaz", 30);
        Person personel2 = new Kadin("Ayşe", "Demir", 62);

        departman.personelEkle(personel1);
        departman.personelEkle(personel2);

        departman.gorevEkle("Proje A");
        departman.gorevEkle("Proje B");

        departman.bilgileriGoster();
    }
}