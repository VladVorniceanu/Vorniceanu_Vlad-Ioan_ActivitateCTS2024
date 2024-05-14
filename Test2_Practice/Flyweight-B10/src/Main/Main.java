package Main;

import Classes.Booking;
import Classes.ClientsFlyweight;
import Classes.IClients;

public class Main {
    public static void main(String[] args) {
        ClientsFlyweight flyweight = new ClientsFlyweight();

        Booking booking1 = new Booking(3, 13);
        Booking booking2 = new Booking(1, 20);

        IClients client1 = flyweight.getClient("Vlad", "112");
        client1.booking(booking1);
        IClients client2 = flyweight.getClient("Andrei", "911");
        client2.booking(booking2);
        IClients client3 = flyweight.getClient("Vlad", "112");
        client3.booking(booking2);
    }
}