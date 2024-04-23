package Classes;

import java.util.ArrayList;

public class Stadion extends Subiect {

    public Stadion() {
        super.listaObservatori = new ArrayList<>();
    }

    @Override
    public void notificaMeciFotbal() {
        super.notificaObservatori("Azi are loc un meci de fotbal");
    }

    @Override
    public void notificaMeciVolley() {
        super.notificaObservatori("Azi are loc un meci de volley");
    }

    @Override
    public void notificaMeciHandball() {
        super.notificaObservatori("Azi are loc un meci de handball");
    }

    public void notificaConcert() {
        super.notificaObservatori("Azi pe stadion va canta Fuego");
    }
}
