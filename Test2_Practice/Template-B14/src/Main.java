import Classes.Client;
import Classes.Restaurant;

public class Main {
    public static void main(String[] args) {
        Client client1 = new Client("Vorniceanu VLad");
        Client client2 = new Client("Adrian");

        Restaurant chinezesc = new Restaurant("HuoHu", 2, 1, 32);
        Restaurant oriental = new Restaurant("HaiHai", 34, 424, 0);
        chinezesc.ocupaMasa(client1);
        chinezesc.ocupaMasa(client2);
        oriental.ocupaMasa(client2);
    }
}