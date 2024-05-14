package Classes;

public class Client {
    IModPlata modPlata;
    private String nume;

    public void plateste(Double total) {
        modPlata.plateste(this.getNume(),total);
    }

    public void setModPlata(IModPlata modPlata) {
        this.modPlata = modPlata;
    }

    public Client(IModPlata modPlata, String nume) {
        this.modPlata = modPlata;
        this.nume = nume;
    }

    public IModPlata getModPlata() {
        return modPlata;
    }

    public String getNume() {
        return nume;
    }
}
