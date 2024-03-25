package Classes;

public abstract class PersonalSpital {
    public String nume;
    public String mail;

    public abstract void descriereAngajat();

    @Override
    public String toString() {
        descriereAngajat();
        return "";
    }
}
