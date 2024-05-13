package Classes;

public class CrediteLeasing implements ICrediteLeasing {
    private String numeClient;
    private double valoare;
    private int perioada;

    public CrediteLeasing(String numeClient, double valoare, int perioada) {
        this.numeClient = numeClient;
        this.valoare = valoare;
        this.perioada = perioada;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public double getValoare() {
        return valoare;
    }

    public void setValoare(double valoare) {
        this.valoare = valoare;
    }

    public int getPerioada() {
        return perioada;
    }

    public void setPerioada(int perioada) {
        this.perioada = perioada;
    }

    @Override
    public void oferireCrediteLeasing() {
        System.out.println("Clientul " + this.numeClient + " are un leasing pe o perioada de " +
                this.perioada + " ani, in valoare de " + this.valoare);
    }
}
