package classes;

public class Pacient {
    private String nume;

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Stare getState() {
        return stare;
    }

    protected void setState(Stare stare) {
        this.stare = stare;
    }

    private Stare stare;

    public Pacient(String nume) {
        this.nume = nume;
        stare = new StareInternat();
    }

    public void seAgraveazaStarea() {
        if (this.stare instanceof StareInternat) {
            Stare subObservatie = new StareSubObservatie();
            subObservatie.setState(this);
            System.out.println("Starea de sanatate a pacientului " + this.nume + " s-a agravat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu este internat.");
        }
    }

    public void seImbunatatestestarea() {
        if (this.stare instanceof StareSubObservatie) {
            Stare internare = new StareInternat();
            internare.setState(this);
            System.out.println("Sanatatea pacientului " + this.nume + " s-a imbunatatit.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu era in stare grava.");
        }
    }

    public void vindecare() {
        if (this.stare instanceof StareInternat) {
            Stare externat = new StareExternat();
            externat.setState(this);
            System.out.println("Pacientul " + this.nume + " este vindecat si externat.");
        } else {
            System.out.println("Pacientul " + this.nume + " nu poate fi externat.");
        }
    }
}
