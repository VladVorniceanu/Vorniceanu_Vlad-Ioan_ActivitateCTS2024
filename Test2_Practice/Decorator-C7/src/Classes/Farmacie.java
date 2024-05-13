package Classes;

public class Farmacie implements IFarmacie{
    String numeFarmacie;
    Double totalDePlata;

    public Farmacie(String numeFarmacie, Double totalDePlata) {
        this.numeFarmacie = numeFarmacie;
        this.totalDePlata = totalDePlata;
    }

    @Override
    public void printeazaBonFiscal() {
        System.out.println("Aveti de plata: " + this.totalDePlata + " RON.\nVa multumim pentru vizita!\n\tFarmacia " + this.numeFarmacie);
    }

    @Override
    public void servesteClientul() {
        System.out.println("Poftiti comanda dumneavoastra!");
        printeazaBonFiscal();
    }
}
