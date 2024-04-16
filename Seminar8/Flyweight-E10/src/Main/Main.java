package Main;

import Classes.Caracteristici;
import Classes.FabricaFlyweight;
import Classes.Pozitie;

public class Main {
    public static void main(String[] args) {
        FabricaFlyweight fabricaFlyweight = new FabricaFlyweight();
        Caracteristici carac1 = new Caracteristici(new Pozitie(2, 3), "red");
        Caracteristici carac2 = new Caracteristici(new Pozitie(24, 31), "blue");
        Caracteristici carac3 = new Caracteristici(new Pozitie(2, 5), "red");
        Caracteristici carac4 = new Caracteristici(new Pozitie(20, 5), "blue");

        fabricaFlyweight.getSpectator(10, 10).deseneazaPersoana(carac1);
        fabricaFlyweight.getSpectator(20, 10).deseneazaPersoana(carac2);
        fabricaFlyweight.getSpectator(10,10).deseneazaPersoana(carac3);
        fabricaFlyweight.getSpectator(20,10).deseneazaPersoana(carac4);
    }

}