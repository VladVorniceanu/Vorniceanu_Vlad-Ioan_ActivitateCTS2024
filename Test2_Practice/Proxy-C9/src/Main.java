import Classes.Client;
import Classes.IVanzareMedicament;
import Classes.ProxyVanzareMedicament;
import Classes.VanzareMedicament;

public class Main {
    public static void main(String[] args) {
        VanzareMedicament medicament1 = new VanzareMedicament(new Client("Vlad", true));
        VanzareMedicament medicament2 = new VanzareMedicament(new Client("Andrei", false));

        IVanzareMedicament proxy1 = new ProxyVanzareMedicament(medicament1);
        IVanzareMedicament proxy2 = new ProxyVanzareMedicament(medicament2);

        medicament1.vindeMedicament();
        medicament2.vindeMedicament();
        proxy1.vindeMedicament();
        proxy2.vindeMedicament();

    }
}