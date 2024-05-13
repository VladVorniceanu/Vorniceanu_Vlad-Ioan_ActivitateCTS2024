package main;

import classes.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gheorghita");

        pacient.seAgraveazaStarea();
        pacient.vindecare();
        pacient.seImbunatatestestarea();
        pacient.vindecare();

        Pacient pacient2 = new Pacient("Ghita");
        pacient2.seAgraveazaStarea();
        pacient2.vindecare();
    }
}