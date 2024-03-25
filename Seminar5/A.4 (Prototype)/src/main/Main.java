package main;

import Classes.Reteta;
import Classes.RetetaAbstracta;
import Classes.RetetaCreme;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, Double> solutii = new HashMap<>();
        solutii.put("Solutie1", 21.09);
        solutii.put("Solutie2", 2432.58);
        Reteta prototip = new Reteta(solutii, "Medicament1");

        RetetaAbstracta reteta2 = prototip.clone();
        System.out.println(reteta2);

        RetetaCreme retetaCremePrototip = new RetetaCreme(1, "Galbenele");
        RetetaAbstracta retetaCremaAbs = retetaCremePrototip.clone();
        System.out.println(retetaCremaAbs);

    }
}