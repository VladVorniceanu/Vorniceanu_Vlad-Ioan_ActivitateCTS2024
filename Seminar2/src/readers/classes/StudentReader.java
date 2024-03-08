package readers.classes;

import clase.Aplicant;
import clase.Student;
import readers.interfaces.AplicantReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader {
    public StudentReader(String fileName) {
        super(fileName);
    }

    @Override
    public List<Aplicant> read() throws FileNotFoundException, NumberFormatException {
        Scanner input = new Scanner(new File(super.fileName));
        input.useDelimiter(",|\n");
        List<Aplicant> studenti = new ArrayList<>();

        while (input.hasNext()) {
            Student aplicant = new Student();
            super.readAplicant(input, aplicant);
            int anStudii = input.nextInt();
            String facultate = (input.next()).toString();
            aplicant.setFacultate(facultate);
            aplicant.setAnStudii(anStudii);
            studenti.add(aplicant);
        }
        input.close();
        return studenti;
    }
}
