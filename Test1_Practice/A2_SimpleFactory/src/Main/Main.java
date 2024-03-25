package Main;

import Classes.PersonalSpital;
import Classes.PersonalSpitalFactory;
import Classes.SpecializariPersonalSpital;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Set<PersonalSpital> personal = new HashSet<>();
        PersonalSpitalFactory fabricaPersonal = new PersonalSpitalFactory();

        personal.add(fabricaPersonal
                .createNewPersonal(SpecializariPersonalSpital.Asistent,
                        "Popescu Asistent",
                        "asistentPopescu@spital.com"));
        personal.add(fabricaPersonal
                .createNewPersonal(SpecializariPersonalSpital.Brancardier,
                        "Adrian Brancardier",
                        "brancardierAdrian@spital.com"));

        System.out.println(personal);
    }
}
