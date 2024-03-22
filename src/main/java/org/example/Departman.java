package org.example;
import java.util.ArrayList;
import java.util.List;

public class Departman {
    private Person teamLead;
    private List<Person> personelList;
    private List<String> assignmentList;

    public Departman(Person teamLead) {
        if (teamLead == null) {
            throw new IllegalArgumentException("Team lead cannot be null.");
        }
        this.teamLead = teamLead;
        this.personelList = new ArrayList<>();
        this.assignmentList = new ArrayList<>();
    }

    public void teamLeadDegistir(Person yeniTeamLead) {
        if (yeniTeamLead == null) {
            throw new IllegalArgumentException("New team lead cannot be null.");
        }
        this.teamLead = yeniTeamLead;
    }

    public void personelEkle(Person personel) {
        personelList.add(personel);
    }

    public void personelCikar(Person personel) {
        personelList.remove(personel);
    }

    public void personelDegistir(int index, Person yeniPersonel) {
        personelList.set(index, yeniPersonel);
    }

    public void gorevEkle(String gorev) {
        assignmentList.add(gorev);
    }

    public void gorevTamamlandi(String gorev) {
        assignmentList.remove(gorev);
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
}



