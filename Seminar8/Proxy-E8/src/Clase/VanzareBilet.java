package Clase;

public class VanzareBilet implements IVanzare{
    private String meciJucat;
    private double pret;
    @Override
    public void vanzare(Persoana persoana) {
        System.out.println("Persoana " + persoana.getNume()
                            + " a cumparat bilet la meciu " + meciJucat
                            + ", platind " + pret + " RON.");
    }

    public VanzareBilet(String meciJucat, double pret) {
        this.meciJucat = meciJucat;
        this.pret = pret;
    }

    public String getMeciJucat() {
        return meciJucat;
    }

    public double getPret() {
        return pret;
    }
}
