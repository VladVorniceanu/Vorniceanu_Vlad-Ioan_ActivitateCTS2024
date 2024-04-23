package Main;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        Subiect salaDeSport = new SalaDeSport();
        Observer abonat1 = new Abonat("abonat1");
        Observer abonat2 = new Abonat("abonat2");
        Observer abonat3 = new Abonat("abonat3");
        Observer abonat4 = new Vecini("abonat4", 500);

        salaDeSport.adaugaAbonati(abonat1);
        salaDeSport.adaugaAbonati(abonat2);
        salaDeSport.adaugaAbonati(abonat3);
        salaDeSport.adaugaAbonati(abonat4);

        salaDeSport.notificaMeciFotbal();
        salaDeSport.notificaMeciHandball();
        salaDeSport.notificaMeciVolley();

        salaDeSport.stergeAbonat(abonat2);
        salaDeSport.notificaObservatori("MESAJ");

        Subiect stadion = new Stadion();
        stadion.adaugaAbonati(abonat1);
        stadion.adaugaAbonati(abonat2);
        stadion.adaugaAbonati(abonat4);
        ((Stadion)stadion).notificaConcert();
    }
}