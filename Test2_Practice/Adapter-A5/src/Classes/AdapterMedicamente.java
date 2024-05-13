package Classes;

public class AdapterMedicamente implements IMedicamentFarmacie {
    MedicamentSpital medicamentSpital;

    public AdapterMedicamente(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Se cere medicamentul din spital: " + this.medicamentSpital.denumire);
        medicamentSpital.achizitioneazaMedicament();
    }
}
