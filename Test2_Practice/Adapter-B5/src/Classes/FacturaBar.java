package Classes;

public class FacturaBar implements ISoftNouBar{
    Client client;
    String numeOperator;
    Double totalComanda;

    public FacturaBar(Client client, String numeOperator, Double totalComanda) {
        this.client = client;
        this.numeOperator = numeOperator;
        this.totalComanda = totalComanda;
    }

    @Override
    public void printeazaFactura() {
        System.out.println("Factura de bar pentru " + this.client.toString() + ", in valoare de " + this.totalComanda + " RON, a fost tiparita de " + numeOperator);
    }
}
