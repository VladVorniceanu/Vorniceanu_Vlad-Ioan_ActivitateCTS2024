package Classes;

public class Pacient {
    String nume;
    int varsta;
    String nrTelefon;
    int gradImbolnavire;
    Medic medicExaminator;

    public Pacient(String nume, int varsta, String nrTelefon, int gradImbolnavire, Medic medicExaminator) {
        this.nume = nume;
        this.varsta = varsta;
        this.nrTelefon = nrTelefon;
        this.gradImbolnavire = gradImbolnavire;
        this.medicExaminator = medicExaminator;
    }

    public void interneazaPacient() {
        if( medicExaminator.verificaPacient(this) ) {
            if( medicExaminator.getSpital().verificaSaloane()) {
                System.out.println("Pacientul " + this.getNume() + " a fost internat.");
            } else {
                System.out.println("Pacientul " + this.getNume() + " nu a putut fi internat in spitalul " + this.medicExaminator.getSpital().getNumeSpital() + " din lipsa de paturi libere.");
            }
        } else {
            System.out.println("Pacientul " + this.getNume() + " nu are nevoie de internare.");
        }
    }

    @Override
    public String toString() {
        return "Pacient{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", nrTelefon='" + nrTelefon + '\'' +
                ", gradImbolnavire=" + gradImbolnavire +
                '}';
    }

    public String getNume() {
        return nume;
    }

    public int getGradImbolnavire() {
        return gradImbolnavire;
    }
}
