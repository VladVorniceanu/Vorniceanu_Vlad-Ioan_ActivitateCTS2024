package Main;


import classes.FacadeCreareCont;
import classes.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana Andrei = new Persoana("Andrei", 18, false, false);
        Persoana Marius = new Persoana("Marius", 27, false, true);
        Persoana Luca = new Persoana("Luca", 16, false, false);
        Persoana Vlad = new Persoana("Vlad", 20, true, false);

        FacadeCreareCont banca = new FacadeCreareCont();

        banca.creareCont(Andrei);
        banca.creareCont(Marius);
        banca.creareCont(Luca);
        banca.creareCont(Vlad);
    }
}