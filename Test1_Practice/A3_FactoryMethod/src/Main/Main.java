package Main;

import Classes.FactoryMethod.AsistentFactory;
import Classes.FactoryMethod.BrancardierFactory;
import Classes.FactoryMethod.MedicFactory;
import Classes.Personal;

import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String[] args) {
        AsistentFactory fabricaAsistenti = new AsistentFactory();
        BrancardierFactory fabricaBrancardieri = new BrancardierFactory();
        MedicFactory fabricaMedici = new MedicFactory();

        Set<Personal> personals = new HashSet<>();

        personals.add(fabricaAsistenti.createPersonal("Asistent1", "a1@mail.com"));
        personals.add(fabricaMedici.createPersonal("Medic1","m1@mail.com"));
        personals.add(fabricaMedici.createPersonal("Medic2", "m2@mail.com"));
        personals.add(fabricaBrancardieri.createPersonal("Branc1","b1@mail.com"));
        personals.add(fabricaAsistenti.createPersonal("Asistent2", "a2@mail.com"));

        System.out.println(personals);
    }
}
