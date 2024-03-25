package Main;

import Classes.RetetaMedicament;
import Classes.RetetaPrototype;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<RetetaPrototype> retete = new HashSet<>();
        Map<String, Double> solutiiAlgocalmin = new HashMap<>();
        solutiiAlgocalmin.put("Ingr 1", 24.3);
        solutiiAlgocalmin.put("Ingr 2", 14.8);
        solutiiAlgocalmin.put("Ingr 3", 0.8);
        solutiiAlgocalmin.put("Ingr 4", 2.8);

        RetetaMedicament algocalmin = new RetetaMedicament("Algocalmin", solutiiAlgocalmin);
        retete.add(algocalmin);
        RetetaPrototype paracetamol = algocalmin.clone();
        retete.add(paracetamol);

        System.out.println(retete);
    }
}
