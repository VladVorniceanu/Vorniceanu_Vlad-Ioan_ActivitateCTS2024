package Classes;

public class Vecini implements Observer{

    private String nume;
    private float distanta;

    public Vecini(String nume, float distanta) {
        this.nume = nume;
        this.distanta = distanta;
    }

    @Override
    public void primesteNotificare(String mesaj) {
        System.out.println(nume + ", sala de la " + distanta + "m de tine a trimis catre abonati urmatorul mesaj: " + mesaj);
    }
}
