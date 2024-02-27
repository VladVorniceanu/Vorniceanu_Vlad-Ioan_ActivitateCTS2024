package readers.classes;

import clase.Aplicant;
import clase.Elev;
import clase.Student;
import readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    public ElevReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev aplicant = new Elev();
            super.readAplicant(input, aplicant);
            int clasa = input.nextInt();
            String tutore = input.next();
            aplicant.setClasa(clasa);
            aplicant.setTutore(tutore);
            elevi.add(aplicant);
        }

        input.close();
        return elevi;
    }
}
