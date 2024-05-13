package Classes;

public class FacturaBucatarie {
    Client client;
    String numeOperator;
    String bucatar;
    String preparatServit;
    Double valoare;

    public FacturaBucatarie(Client client, String numeOperator, String bucatar, String preparatServit, Double valoare) {
        this.client = client;
        this.numeOperator = numeOperator;
        this.bucatar = bucatar;
        this.preparatServit = preparatServit;
        this.valoare = valoare;
    }

    public void printeazaFacturaBucatarie(){
        System.out.println("Factura de bucatarie pentru clientul " + this.client + ":" +
                "\n\tPreparat servit: " + this.preparatServit + "\t Valoare: " + this.valoare +
                "\n\t\tGatit de chef: " + this.bucatar + ", servit de: " + numeOperator);
    }
}

