package Classes;

import java.util.*;

public class AplicatieVanzare implements IAplicatieVanzare {
    public String idMedicamentDorit = "";
    public Map<String, Integer> medicamenteInStoc;
    public String numeMagazin;

    public AplicatieVanzare(Map<String, Integer> medicamenteInStoc, String numeMagazin) {
        this.medicamenteInStoc = medicamenteInStoc;
        this.numeMagazin = numeMagazin;
    }

    @Override
    public void setareMedicament(String idMedicament) {
        System.out.println("Se verifica in magazin");
        this.idMedicamentDorit = idMedicament;
    }

    @Override
    public boolean verificareDisponibilitate(int cantitateDorita) {
        if( this.medicamenteInStoc.containsKey(idMedicamentDorit)) {
            return this.medicamenteInStoc.get(idMedicamentDorit) > cantitateDorita;
        }
        return false;
    }
}
