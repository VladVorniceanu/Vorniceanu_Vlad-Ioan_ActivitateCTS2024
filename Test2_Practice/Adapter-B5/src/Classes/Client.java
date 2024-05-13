package Classes;

public class Client {
    String numeClient;
    int nrMasa;
    String email;

    @Override
    public String toString() {
        return "clientul " + numeClient + " de la masa " + nrMasa;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public Client(String numeClient, int nrMasa, String email) {
        this.numeClient = numeClient;
        this.nrMasa = nrMasa;
        this.email = email;
    }
}
