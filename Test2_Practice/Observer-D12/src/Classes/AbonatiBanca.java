package Classes;

public class AbonatiBanca implements Abonati {
    private String nume;

    public AbonatiBanca(String nume) {
        this.nume = nume;
    }

    @Override
    public void notificaAbonati(String mesaj) {
        System.out.println("Stimate " + this.nume + ",\nAi primit de la banca mesajul:\n\t"+mesaj+'\n');
    }
}
