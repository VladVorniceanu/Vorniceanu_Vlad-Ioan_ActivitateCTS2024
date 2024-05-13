package Main;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Vlad Vorniceanu", 2, "vorniceanu.v@gmail.com");
        ISoftNouBar adapterFacturaBucatarie = new AdapterSoftNouBar(new FacturaBucatarie(client1, "Operator Marius", "Florin Bontea", "Scoici Saint-Jacques", 250.0));
        ISoftNouBar facturaBar = new FacturaBar(client1, "Octavian", 452.82);

        adapterFacturaBucatarie.printeazaFactura();
        facturaBar.printeazaFactura();
    }
}