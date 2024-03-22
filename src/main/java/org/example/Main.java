package org.example;

public class Main {
    public static void main(String[] args) {
        Person teamLead = new Person("Osman", "Hak", "01.10.1975");
        Departman departman = new Departman(teamLead);

        Person personel1 = new Person("Ahmet", "Yılmaz", "01.12.1990");
        Person personel2 = new Person("Ayşe", "Demir", "01.10.1969");



            departman.personelEkle(personel1);
            departman.personelEkle(personel2);

            departman.gorevEkle("Proje A");
            departman.gorevEkle("Proje B");

            // Departmanın durumunu kontrol etmek için çıktı alabilirsiniz
            System.out.println("Departman Bilgileri:");
            System.out.println("Team Lead: " + departman.getTeamLead().getAd() + " " + departman.getTeamLead().getSoyad());
            System.out.println("Personel Listesi: " + departman.getPersonelList());
            System.out.println("Görev Listesi: " + departman.getAssignmentList());
        }
    }