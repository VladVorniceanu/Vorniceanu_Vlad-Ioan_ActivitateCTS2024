package Classes;

import java.util.HashMap;
import java.util.Map;

public class ClientsFlyweight {
    private Map<String, IClients> clients;

    public ClientsFlyweight() {
        this.clients = new HashMap<>();
    }

    public IClients getClient(String name, String telephone) {
        String key = name + telephone;
        IClients client = clients.get(key);
        if(client == null) {
            client = new Clients(name, telephone);
            clients.put(key, client);
        }
        return client;
    }
}
