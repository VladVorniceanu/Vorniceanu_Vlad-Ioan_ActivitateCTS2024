package Main;

import Classes.AdapterAplicatieVanzare;
import Classes.AplicatieDepozit;
import Classes.AplicatieVanzare;
import Classes.IAplicatieDepozit;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> medicamente = new HashMap<>();
        medicamente.put("Algocalmin", 3);
        medicamente.put("Aspenter", 6);

        IAplicatieDepozit aplicatieDepozit = new AplicatieDepozit(medicamente, "Catena_Depozit");
        System.out.println("In depozit " + ( !aplicatieDepozit.verificaStocPentruMedicament("Algocalmin", 4) ? "nu " : "" ) + "exista 4 bucati de algocalmin.");
        System.out.println("In depozit " + ( !aplicatieDepozit.verificaStocPentruMedicament("Aspenter", 2) ? "nu " : "" ) + "exista 2 bucati de Aspenter.");

        IAplicatieDepozit adapterAplicatieVanzare = new AdapterAplicatieVanzare( new AplicatieVanzare(medicamente, "Farmacia Catena"));
        System.out.println("In depozit " + ( !adapterAplicatieVanzare.verificaStocPentruMedicament("Algocalmin", 4) ? "nu " : "" ) + "exista 4 bucati de algocalmin.");
        System.out.println("In depozit " + ( !adapterAplicatieVanzare.verificaStocPentruMedicament("Aspenter", 2) ? "nu " : "" ) + "exista 2 bucati de Aspenter.");
    }
}