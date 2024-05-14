import Classes.Card;
import Classes.Cash;
import Classes.Client;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client(new Card(), "Vlad");
        Client client2 = new Client(new Cash(), "Andrei");

        client2.plateste(142.53);
        client2.setModPlata(new Card());
        client2.plateste(122.20);

        client1.plateste(100.0);
        client1.setModPlata(new Cash());
        client1.plateste(13245.82);

    }
}