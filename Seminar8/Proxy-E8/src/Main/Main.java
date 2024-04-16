package Main;

import Clase.*;

public class Main {
    public static void main(String[] args) {
        IVanzare biletVandut = new VanzareBilet("BAR - RMA", 1500);
        Persoana spectator = new Persoana("Lionel Messi", 38, true);
        Persoana spectatorJunior = new Persoana("Misu", 12, true);

        biletVandut.vanzare(spectatorJunior);
        biletVandut.vanzare(spectator);

        IVanzare proxyVarsta = new ProxyVarsta(biletVandut);
        proxyVarsta.vanzare(spectator);
        proxyVarsta.vanzare(spectatorJunior);

        IVanzare proxyGen = new ProxyGen(proxyVarsta);
        proxyGen.vanzare(spectator);
        Persoana spectatorFeminin = new Persoana("Angelina Jolie", 13, false);
        Persoana spectatorFeminin2 = new Persoana("Angelina Jolie", 15, false);
        proxyGen.vanzare(spectatorFeminin);
        proxyGen.vanzare(spectatorFeminin2);

    }
}