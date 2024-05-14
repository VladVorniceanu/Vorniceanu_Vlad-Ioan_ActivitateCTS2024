package Classes;

import java.util.List;

public class Autobuz extends Subiect{
    int nrAutobuz;

    public Autobuz(List<Abonati> abonatiList, int nrAutobuz) {
        super(abonatiList);
        this.nrAutobuz = nrAutobuz;
    }

    @Override
    public void pleacaAutobuzul() {
        String mesajPlecareAutobuz = "Autobuzul nr. " + this.nrAutobuz + " a plecat de la capat de linie.";
        super.notificaAbonati(mesajPlecareAutobuz);
    }

    @Override
    public void intarzieAutobuzul() {
        String mesajIntarziere = "Autobuzul nr. " + this.nrAutobuz + " intarzie. A intampinat trafic";
        super.notificaAbonati(mesajIntarziere);
    }
}
