package Main;

import Classes.IPacient;
import Classes.Pacient;
import Classes.PacientFlyweightFactory;
import Classes.Spitalizare;

public class Main {
    public static void main(String[] args) {
        PacientFlyweightFactory pacienti = new PacientFlyweightFactory();
        Spitalizare program1 = new Spitalizare(1,2,10,"Oprescu", "Traumatism femural");
        Spitalizare program2 = new Spitalizare(2,1,42,"Ionescu", "Leucemie");
        Spitalizare program3 = new Spitalizare(4,23,4,"Chipciu", "Interventie chirurgicala");

        IPacient pacient = pacienti.getPacient("Ion", "112", "Bld. Energeticienilor", 23);
        IPacient pacient1 = pacienti.getPacient("Ion", "122", "djsakl", 49);

        pacient.descriePacient(program1);
        pacient1.descriePacient(program2);
    }
}