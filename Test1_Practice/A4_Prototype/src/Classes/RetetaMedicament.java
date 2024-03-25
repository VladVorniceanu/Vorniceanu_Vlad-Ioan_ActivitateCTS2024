package Classes;

import java.util.HashMap;
import java.util.Map;

public class RetetaMedicament implements RetetaPrototype {
    public String nume;
    Map<String, Double> cantitatiSollutii = new HashMap<>();

    public RetetaMedicament(String nume, Map<String, Double> cantitatiSollutii) {
        this.nume = nume;
        this.cantitatiSollutii = cantitatiSollutii;
    }

    public RetetaMedicament() {
        this.nume = "N/A";
        this.cantitatiSollutii = null;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Map<String, Double> getCantitatiSollutii() {
        return cantitatiSollutii;
    }

    public void setCantitatiSollutii(Map<String, Double> cantitatiSollutii) {
        this.cantitatiSollutii = new HashMap<>();
        for (String solutie : cantitatiSollutii.keySet()) {
            this.cantitatiSollutii.put(
                    solutie, cantitatiSollutii.get(solutie)
            );
        }
    }

    @Override
    public String toString() {
        return "RetetaMedicament{ " +
                " nume= " + nume + '\'' +
                ", cantitatiSollutii= " + cantitatiSollutii +
                '}';
    }

    @Override
    public RetetaPrototype clone() {
        RetetaMedicament retetaClona = new RetetaMedicament();
        retetaClona.setCantitatiSollutii(this.cantitatiSollutii);
        retetaClona.setNume(this.nume);
        return retetaClona;
    }
}
