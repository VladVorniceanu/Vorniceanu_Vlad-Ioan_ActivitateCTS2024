package Classes;

public class Restaurant extends Template{
    String denumire;
    int mese;
    int serveteleDisponibile;
    int tacamuriDisponibile;

    public Restaurant(String denumire, int mese, int serveteleDisponibile, int tacamuriDisponibile) {
        this.denumire = denumire;
        this.mese = mese;
        this.serveteleDisponibile = serveteleDisponibile;
        this.tacamuriDisponibile = tacamuriDisponibile;
    }

    @Override
    public boolean curataMasa() {
        System.out.println("\nBine ati venit la restaurantul " + this.denumire + " stimate client");
        if(mese!=0) {
            System.out.println("A fost gasita o masa. A fost curatata");
            mese--;
            return true;
        } else {
            System.out.println("Nu a fost gasita masa libera.");
            return false;
        }
    }

    @Override
    public boolean asazaServetele() {
        if(serveteleDisponibile!=0) {
            System.out.println("Au fost asezate servetelele");
            serveteleDisponibile--;
            return true;
        } else {
            System.out.println("Nu mai avem servetele, nu putem pregati masa. Ne pare rau");
            return false;
        }
    }

    @Override
    public boolean asazaTacamuri() {
        if(tacamuriDisponibile!=0) {
            System.out.println("Au fost asezate tacamuri pe masa");
            tacamuriDisponibile--;
            return true;
        } else {
            System.out.println("Nu mai avem tacamuri. Ne pare rau");
            return false;
        }
    }

    @Override
    public void invitaPersoaneLaMasa(Client client) {
        System.out.println("Stimate " + client.getNume() + ", va invitam sa luati loc la masa!");
    }
}
