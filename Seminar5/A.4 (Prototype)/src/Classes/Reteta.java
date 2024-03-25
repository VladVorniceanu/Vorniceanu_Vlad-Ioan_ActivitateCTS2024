package Classes;

import java.util.HashMap;
import java.util.Map;

public class Reteta implements RetetaAbstracta {
    private Map<String, Double> solutii;
    private String numeMedicament;

    public Reteta(Map<String, Double> solutii, String numeMedicament) {
        this.solutii = solutii;
        this.numeMedicament = numeMedicament;
    }

    public Reteta() {
        numeMedicament = "N/A";
        solutii = null;
    }

    public Map<String, Double> getSolutii() {
        return solutii;
    }

    public void setSolutii(Map<String, Double> solutii) {
        this.solutii = new HashMap<>();
        for (String nume : solutii.keySet()) {
            this.solutii.put(nume, solutii.get(nume));
        }
    }

    public String getNumeMedicament() {
        return numeMedicament;
    }

    public void setNumeMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }


    @Override
    public RetetaAbstracta clone() {
        Reteta abstracta = new Reteta();
        abstracta.setSolutii(this.solutii);
        abstracta.setNumeMedicament(this.numeMedicament);
        return abstracta;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "solutii=" + solutii +
                ", numeMedicament='" + numeMedicament + '\'' +
                '}';
    }
}
