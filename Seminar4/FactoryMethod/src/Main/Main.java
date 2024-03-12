package Main;

import Classes.Factory.*;
import Classes.PersonalSpital;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void prelucrarePersonal(FabricaPersonal fabrica, String nume, int salariul) {
        PersonalSpital personal = fabrica.createPersonal(nume, salariul);
        personal.afisareDetalii();
    }

    public static void main(String[] args) {
        FabricaPersonal fabricaMedic = new FabricaMedic();
        FabricaPersonal fabricaAsistent = new FabricaAsistent();
        FabricaPersonal fabricaBrancardier = new FabricaBrancardier();

        prelucrarePersonal(fabricaMedic,"medicul 1", 8000);
        prelucrarePersonal(fabricaAsistent,"asistenul meu", 1783);
        prelucrarePersonal(fabricaBrancardier,"un brancardier", 4282);
        prelucrarePersonal(new FabricaMedic(), "alt medic", 53829);
        prelucrarePersonal(new FabricaInfirmier(), "un infirmier", 15099);
    }
}