package Classes;

public class VanzareMedicament implements IVanzareMedicament{

    private Client client;

    public VanzareMedicament(Client client) {
        this.client = client;
    }

    public Client getClient() {
        return client;
    }


    @Override
    public void vindeMedicament() {
        System.out.println("Clientul " + client.getNume() + " a fost servit cu medicamentul dorit.");
    }
}
