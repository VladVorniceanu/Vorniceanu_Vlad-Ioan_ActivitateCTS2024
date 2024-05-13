package Classes;

import java.util.Map;

public class AplicatieDepozit implements IAplicatieDepozit {
    public Map<String, Integer> medicamenteInStoc;
    public String numeDepozit;

    public AplicatieDepozit(Map<String, Integer> medicamenteInStoc, String numeDepozit) {
        this.medicamenteInStoc = medicamenteInStoc;
        this.numeDepozit = numeDepozit;
    }
    @Override
    public boolean verificaStocPentruMedicament(String idMedicament, int cantitateDorita) {
        System.out.println("Se verifica in depozit");
        if( this.medicamenteInStoc.containsKey(idMedicament)) {
            return this.medicamenteInStoc.get(idMedicament) > cantitateDorita;
        }
        return false;
    }
}
