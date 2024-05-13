package Classes;

public class Credit {
    private String numeClient;
    private double valoareTotala;
    private int nrRate;
    private double sumaAvans;
    private int perioada;

    public Credit(String numeClient, double valoareTotala, int nrRate, double sumaAvans, int perioada) {
        this.numeClient = numeClient;
        this.valoareTotala = valoareTotala;
        this.nrRate = nrRate;
        this.sumaAvans = sumaAvans;
        this.perioada = perioada;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public double getValoareTotala() {
        return valoareTotala;
    }

    public int getNrRate() {
        return nrRate;
    }

    public double getSumaAvans() {
        return sumaAvans;
    }

    public int getPerioada() {
        return perioada;
    }
}
