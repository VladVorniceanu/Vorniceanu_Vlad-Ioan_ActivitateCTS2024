package Classes;

public class ProxyVanzareMedicament implements IVanzareMedicament{

    VanzareMedicament vanzareMedicament;

    public ProxyVanzareMedicament(VanzareMedicament vanzareMedicament) {
        this.vanzareMedicament = vanzareMedicament;
    }

    public ProxyVanzareMedicament(Client client) {
        this.vanzareMedicament = new VanzareMedicament(client);
    }

    @Override
    public void vindeMedicament() {
        if(vanzareMedicament.getClient().isAreReteta()) {
            vanzareMedicament.vindeMedicament();
        } else {
            System.out.println("Clientul " + vanzareMedicament.getClient().getNume() + " nu are reteta deci nu poate fi servit.");
        }
    }
}
