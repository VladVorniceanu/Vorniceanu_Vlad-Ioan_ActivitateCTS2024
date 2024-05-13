package Classes;

public class AdapterAplicatieVanzare implements IAplicatieDepozit {
    AplicatieVanzare aplicatieVanzare;

    public AdapterAplicatieVanzare(AplicatieVanzare aplicatieVanzare) {
        this.aplicatieVanzare = aplicatieVanzare;
    }

    @Override
    public boolean verificaStocPentruMedicament(String idMedicament, int cantitateDorita) {
        this.aplicatieVanzare.setareMedicament(idMedicament);
        return this.aplicatieVanzare.verificareDisponibilitate(cantitateDorita);
    }
}
