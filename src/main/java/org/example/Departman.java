package org.example;
import java.util.ArrayList;
import java.util.List;

public class Departman {
    private Person teamLead;
    private List<Person> personelList;
    private List<String> assignmentList;

    public Departman(Person teamLead) {
        this.teamLead = teamLead;
        this.personelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public Person getTeamLead() {
        return teamLead;
    }

    public List<Person> getPersonelList() {
        return personelList;
    }

    public List<String> getAssignmentList() {
        return assignmentList;
    }

    public void personelEkle(Person person) {
        personelList.add(person);
    }

    public void gorevEkle(String gorev) {
        assignmentList.add(gorev);
    }

    public void bilgileriGoster() {
        System.out.println("Departman Bilgileri:");
        System.out.println("Team Lead: " + teamLead.getAd() + " " + teamLead.getSoyad());
        System.out.println("Personel Listesi: ");
        for (Person person : personelList) {
            System.out.println(person.getAd() + " " + person.getSoyad() + " - Yaş: " + person.getYas());
        }
        System.out.println("Görev Listesi: " + assignmentList);
    }
}



