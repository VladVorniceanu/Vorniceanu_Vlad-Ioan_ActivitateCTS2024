package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament extends StructuraAbstracta {
    private List<StructuraAbstracta> structuri;
    private String directorDepartament;

    public Departament(String nume, String directorDepartament) {
        super(nume);
        this.directorDepartament = directorDepartament;
        this.structuri = new ArrayList<>();
    }

    public Departament(String nume) {
        super(nume);
    }

    @Override
    public void adaugaStructura(StructuraAbstracta structuraNoua) {
        structuri.add(structuraNoua);
    }

    @Override
    public void stergeStructura(StructuraAbstracta structuraDeSters) {
        structuri.remove(structuraDeSters);
    }

    @Override
    public StructuraAbstracta getStructura(int index) {
        if(index>=0 && index <this.structuri.size()) {
            return structuri.get(index);
        } else {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public void afisareDescriere(String indentare) {
        System.out.println(indentare
                + "Departamentul " + super.getNume()
                + " este condus de " + this.directorDepartament
                + " si are urmatoarea componenta: ");
        for (StructuraAbstracta sa : this.structuri) {
            sa.afisareDescriere(indentare+'\t');
        }
    }
}
