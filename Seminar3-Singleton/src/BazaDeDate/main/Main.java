package BazaDeDate.main;
import BazaDeDate.Classes.*;

public class Main {
    public static void main(String[] args) {
        ConexiuneBazaDeDate conexiune1 = ConexiuneBazaDeDate.getInstance("Baza1", 20, "link1");
        ConexiuneBazaDeDate conexiune2 = ConexiuneBazaDeDate.getInstance("Baza2", 25, "altLink");

        conexiune1.setNumeBaza("NumeBazaNoua1");
        conexiune2.setNumeBaza("AltNumeBazaNoua2");

        System.out.println(conexiune1);
        System.out.println(conexiune2);
    }
}
