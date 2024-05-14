package Classes;

import java.util.List;

public class Banca extends Subiect {
    String nume;

    public Banca(List<Abonati> abonati, String nume) {
        super(abonati);
        this.nume = nume;
    }

    public void mesajCritic(String mesaj) {
        super.notificaAbonati("MESAJ CRITIC: " + mesaj);
    }

    @Override
    public void newsletter(String mesaj) {
        String mesajNewsletter = "NEWSLETTER: " + mesaj;
        super.notificaAbonati(mesajNewsletter);
    }

    @Override
    public void plataEfectuata(double suma) {
        String mesajPlataEfectuata = "PLATA EFECTUATA: A fost platita suma de " + suma + " RON";
        super.notificaAbonati(mesajPlataEfectuata);
    }

    @Override
    public void baniIntrati(double suma) {
        String mesajBaniIntrati = "Ai primit bani: contul tau a fost crediat cu suma de " + suma + " RON";
        super.notificaAbonati(mesajBaniIntrati);
    }
}
