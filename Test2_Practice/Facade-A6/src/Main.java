import Classes.Medic;
import Classes.Pacient;
import Classes.Salon;
import Classes.Spital;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Salon> saloane = new ArrayList<>();
        saloane.add(new Salon(1, 3, 2));
        saloane.add(new Salon(2, 6, 6));
        saloane.add(new Salon(3, 6, 5));

        Spital spital = new Spital("Spitalul de nebuni", saloane);

        Pacient pacient1 = new Pacient("Vlad", 22, "112", 6, new Medic("Popescu", spital));
        Pacient pacient2 = new Pacient("Andrei", 22, "112", 3, new Medic("Adrian", spital));
        Pacient pacient3 = new Pacient("Ion", 22, "112", 8, new Medic("Enescu", spital));
        Pacient pacient4 = new Pacient("Mircea", 22, "112", 6, new Medic("Popescu", spital));

        pacient1.interneazaPacient();
        pacient2.interneazaPacient();
        pacient3.interneazaPacient();
        pacient4.interneazaPacient();

    }
}