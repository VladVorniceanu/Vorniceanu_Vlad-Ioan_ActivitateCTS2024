package Classes;

public abstract class PersonalSpital {
    private float salariul;
    private String nume;

    public PersonalSpital(float salariul, String nume) {
        this.salariul = salariul;
        this.nume = nume;
    }

    @Override
    public String toString() {
        return "PersonalSpital{" +
                "salariul=" + salariul +
                ", nume='" + nume + '\'' +
                '}';
    }

    public float getSalariul() {
        return salariul;
    }

    public String getNume() {
        return nume;
    }

    public abstract void afisareDetalii();
}
