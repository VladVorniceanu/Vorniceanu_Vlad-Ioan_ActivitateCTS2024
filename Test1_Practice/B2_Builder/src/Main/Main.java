package Main;

import Classes.Builder.ClientBuilder;
import Classes.Client;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Client>clients = new HashSet<>();
        clients.add(new ClientBuilder("Popescu", 3)
                .setWindowTable(true)
                .setNiceChair(true)
                .build());

        clients.add(new ClientBuilder("Vorniceanu", 8)
                .setWindowTable(true)
                .setMusicPersonalised(true)
                .setNiceChair(true)
                .setTableArranged(true)
                .build());

        System.out.println(clients);
    }
}
