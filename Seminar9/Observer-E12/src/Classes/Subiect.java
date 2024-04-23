package Classes;

import java.util.ArrayList;
import java.util.List;

public abstract class Subiect {
    List<Observer> listaObservatori  ;
    public void adaugaAbonati(Observer observatorNou) {
        listaObservatori.add(observatorNou);
    }

    public void stergeAbonat(Observer observatorDeSters) {
        listaObservatori.remove(observatorDeSters);
    }

    public void notificaObservatori(String mesaj) {
        for (Observer observer:listaObservatori) {
            observer.primesteNotificare(mesaj);
        }
    }

    public abstract void notificaMeciFotbal();
    public abstract void notificaMeciVolley();
    public abstract void notificaMeciHandball();
}
