package Classes;

public class Client {
    private IProcesareDocumente tipClient;
    private String numeClient;

    public Client(IProcesareDocumente tipClient, String numeClient) {
        this.tipClient = tipClient;
        this.numeClient = numeClient;
    }

    public void prezintaDocumente() {
        tipClient.proceseazaDocumente(numeClient);
    }

    public IProcesareDocumente getTipClient() {
        return tipClient;
    }

    public void setTipClient(IProcesareDocumente tipClient) {
        this.tipClient = tipClient;
    }

    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }
}
