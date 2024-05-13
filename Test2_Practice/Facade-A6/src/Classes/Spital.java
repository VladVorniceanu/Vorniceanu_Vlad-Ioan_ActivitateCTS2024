package Classes;

import java.util.List;

public class Spital {
    String numeSpital;
    List<Salon> saloaneSpital;

    public Spital(String numeSpital, List<Salon> saloaneSpital) {
        this.numeSpital = numeSpital;
        this.saloaneSpital = saloaneSpital;
    }

    public String getNumeSpital() {
        return numeSpital;
    }

    public boolean verificaSaloane() {
        for(Salon salon: saloaneSpital) {
            if(salon.verificaLocSalon()) {
                return true;
            }
        }
        return false;
    }
}
