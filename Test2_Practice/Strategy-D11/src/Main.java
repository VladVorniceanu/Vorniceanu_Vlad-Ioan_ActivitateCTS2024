import Classes.Client;
import Classes.PersoaneFizice;
import Classes.PersoaneJuridice;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client(new PersoaneFizice(), "Vlad");
        Client client2 = new Client(new PersoaneJuridice(), "Termovab");

        client2.prezintaDocumente();
        client1.prezintaDocumente();

        client1.setTipClient(new PersoaneJuridice());
        client1.setNumeClient("VVF SRL");
        client1.prezintaDocumente();
    }
}