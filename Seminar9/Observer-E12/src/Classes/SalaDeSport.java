package Classes;

import java.util.ArrayList;

public class SalaDeSport extends Subiect {

    public SalaDeSport() {
        super.listaObservatori = new ArrayList<>();
    }

    @Override
    public void notificaMeciFotbal() {
        String mesaj = "Va avea loc un meci de fotbal pe 3 mai la ora 20!";
        super.notificaObservatori(mesaj);
    }

    @Override
    public void notificaMeciVolley() {
        String mesaj = "Va avea loc un meci de volley maine la ora 14!";
        super.notificaObservatori(mesaj);
    }

    @Override
    public void notificaMeciHandball() {
        String mesaj = "Va avea loc un meci de handball la ora 18!";
        super.notificaObservatori(mesaj);
    }
}
