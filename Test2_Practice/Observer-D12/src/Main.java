import Classes.Abonati;
import Classes.AbonatiBanca;
import Classes.Banca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Abonati> abonati = new ArrayList<>();
        Abonati abonat1 = new AbonatiBanca("Vlad");
        abonati.add(abonat1);
        abonati.add(new AbonatiBanca("Ioan"));
        abonati.add(new AbonatiBanca("Stefan"));
        Banca banca1 = new Banca(abonati, "Banca transilvania");

        banca1.baniIntrati(100);
        banca1.mesajCritic("ATENTIE. SERVERELE AU FOST SPARTE");
        banca1.newsletter("Acum poti sa aduci salariul la noi...");
        banca1.plataEfectuata(140);
        banca1.abonare(new AbonatiBanca("Florin"));
        banca1.dezabonare(abonat1);
        banca1.mesajCritic("Inchidem banca");
    }
}