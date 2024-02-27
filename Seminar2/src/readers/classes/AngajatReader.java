package readers.classes;

import clase.Angajat;
import clase.Aplicant;
import clase.Elev;
import readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatReader extends AplicantReader {

    public AngajatReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
            Angajat angajat = new Angajat();
            super.readAplicant(input, angajat);
            int salariu = input.nextInt();
            String ocupatie = input.next();
            angajat.setSalariu(salariu);
            angajat.setOcupatie(ocupatie);
            angajati.add(angajat);
        }
        input.close();
        return angajati;
    }
}
