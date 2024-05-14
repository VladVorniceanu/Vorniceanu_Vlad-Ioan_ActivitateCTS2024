package Classes;

import java.util.List;

public abstract class Subiect {
    List<Abonati> abonatiList;

    public void abonare(Abonati abonatNou) {
        abonatiList.add(abonatNou);
    }

    public void dezabonare(Abonati abonatDeSters) {
        abonatiList.remove(abonatDeSters);
    }

    public void notificaAbonati(String mesaj) {
        for(Abonati abonat : abonatiList ) {
            abonat.notificare("NOTIFICARE STB: " + mesaj);
        }
    }

    public Subiect(List<Abonati> abonatiList) {
        this.abonatiList = abonatiList;
    }

    public abstract void pleacaAutobuzul();
    public abstract void intarzieAutobuzul();
}
