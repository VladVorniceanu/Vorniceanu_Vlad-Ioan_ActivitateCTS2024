package Main;

import Classes.Pacient;
import Classes.SpitalPublic;

public class Main {
    public static void main(String[] args) {

        SpitalPublic spitalPublic = new SpitalPublic("Coltea", 2);
        Pacient pacient1 = new Pacient("Ghita");
        Pacient pacient2 = new Pacient("Andrei");
        Pacient pacient3 = new Pacient("Vlad");

        spitalPublic.internare(pacient1);
        spitalPublic.internare(pacient2);
        spitalPublic.internare(pacient3);
        

    }
}