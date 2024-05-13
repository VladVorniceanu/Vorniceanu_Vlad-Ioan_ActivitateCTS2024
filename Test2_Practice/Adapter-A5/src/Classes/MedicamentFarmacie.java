package Classes;

public class MedicamentFarmacie implements IMedicamentFarmacie{

    public String denumireMedicament;

    public MedicamentFarmacie(String denumireMedicament) {
        this.denumireMedicament = denumireMedicament;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Se cumpara medicamentul " + this.denumireMedicament + " direct din farmacie");
    }
}
