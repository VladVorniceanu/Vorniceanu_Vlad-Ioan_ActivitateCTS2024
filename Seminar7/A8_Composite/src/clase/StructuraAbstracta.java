package clase;

public abstract class StructuraAbstracta {
    private String nume;

    public StructuraAbstracta(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public abstract void adaugaStructura(StructuraAbstracta structuraNoua);
    public abstract void stergeStructura(StructuraAbstracta structuraDeSters);
    public abstract StructuraAbstracta getStructura(int index);
    public abstract void afisareDescriere(String indentare);
}
