package readers.interfaces;

import clase.Aplicant;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;


public abstract class AplicantReader {
    protected String fileName;

    public AplicantReader(String fileName) {
        this.fileName = fileName;
    }

    public void readAplicant(Scanner input, Aplicant aplicant) {
        String nume = input.next();
        String prenume = (input.next()).toString();
        int varsta = Integer.valueOf(input.nextInt());
        int punctaj = Integer.valueOf(input.nextInt());
        int nr = Integer.valueOf(input.nextInt());
        String[] vect = new String[nr];
        for (int i = 0; i < nr; i++)
            vect[i] = input.next();
        aplicant.setPrenume(prenume);
        aplicant.setNume(nume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nr, vect);
    }

    public abstract List<Aplicant> read() throws FileNotFoundException;
}
