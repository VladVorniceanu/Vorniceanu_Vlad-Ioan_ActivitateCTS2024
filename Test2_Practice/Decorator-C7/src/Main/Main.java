package Main;

import Classes.DecoratorBonFiscal;
import Classes.Farmacie;
import Classes.IFarmacie;

public class Main {
    public static void main(String[] args) {
        IFarmacie bonFiscal = new Farmacie("Catena", 461.20);
        bonFiscal.servesteClientul();

        IFarmacie bonDecorat = new DecoratorBonFiscal(new Farmacie("Dona", 133.9));
        bonDecorat.servesteClientul();
    }
}