package clase;

public class Sectie extends StructuraAbstracta{
    private int nrAngajati;
    private String sefSectie;

    public Sectie(String nume, int nrAngajati, String sefSectie) {
        super(nume);
        this.nrAngajati = nrAngajati;
        this.sefSectie = sefSectie;
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraNoua) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void stergeStructura(StructuraAbstracta structuraDeSters) {
        throw new UnsupportedOperationException();

    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        throw new UnsupportedOperationException();

    }

    @Override
    public void afisareDescriere(String indentare) {
        System.out.println(indentare+"Sectia " + super.getNume()
                            + " este condusa de " + this.sefSectie
                            + " si are " + this.nrAngajati + " angajati");
    }
}
