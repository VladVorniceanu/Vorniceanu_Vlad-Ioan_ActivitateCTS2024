package Classes;

public class Client {
    private String nume;
    private boolean areReteta;

    public Client(String nume, boolean areReteta) {
        this.nume = nume;
        this.areReteta = areReteta;
    }

    public String getNume() {
        return nume;
    }

    public boolean isAreReteta() {
        return areReteta;
    }

    @Override
    public String toString() {
        return "Client{" +
                "nume='" + nume + '\'' +
                ", areReteta=" + areReteta +
                '}';
    }
}
