package program;

import clase.Departament;
import clase.Sectie;
import clase.StructuraAbstracta;

public class Main {
    public static void main(String[] args) {
        StructuraAbstracta cardiologie = new Departament("Cardiologie", "Gigel");
        StructuraAbstracta oftalmologie = new Departament("Oftalmologie", "Vasile");

        StructuraAbstracta terapieIntensiva = new Sectie("ATI", 25, "Ion");
        StructuraAbstracta donare = new Sectie("Donare", 5, "Gogu");
        StructuraAbstracta optometrie = new Sectie("Optometrie", 2, "Silvia");

        cardiologie.adaugaStructura(terapieIntensiva);
        cardiologie.adaugaStructura(donare);
        oftalmologie.adaugaStructura(optometrie);

        StructuraAbstracta spital = new Departament("Spitalul de nebuni ASE", "CSIE");
        spital.adaugaStructura(cardiologie);
        spital.adaugaStructura(oftalmologie);

        spital.afisareDescriere("\t");
    }
}