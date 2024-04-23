package Main;

import Classes.Portar;
import Classes.VerificatorPeluza;
import Classes.VerificatorTribuna;
import Classes.VerificatorVIP;

public class Main {
    public static void main(String[] args) {
        Portar portarStadion = new Portar();
        String suporter1 = "GigelVIP";
        String suporter2 = "GigelPeluza";
        String suporter3 = "GigelTribuna";

        portarStadion.setStrategie(new VerificatorVIP());
        portarStadion.verificaSuporter(suporter1);

        portarStadion.setStrategie(new VerificatorPeluza());
        portarStadion.verificaSuporter(suporter2);

        portarStadion.setStrategie(new VerificatorTribuna());
        portarStadion.verificaSuporter(suporter3);
    }
}