package Classes;

import java.util.List;

public abstract class Subiect {
    List<Abonati> abonati;

    public Subiect(List<Abonati> abonati) {
        this.abonati = abonati;
    }

    public void abonare(Abonati abonatNou) {
        abonati.add(abonatNou);
    }

    public void dezabonare(Abonati abonatDeSters) {
        abonati.remove(abonatDeSters);
    }

    public void notificaAbonati(String mesaj) {
        for(Abonati abonat:abonati) {
            abonat.notificaAbonati(mesaj);
        }
    }

    public abstract void newsletter(String mesaj);
    public abstract void plataEfectuata(double suma);
    public abstract void baniIntrati(double suma);
}
