package Classes;

public class Portar {
    private IVerificator strategie;

    public Portar(IVerificator strategie) {
        this.strategie = strategie;
    }

    public Portar() {
        this.strategie = new VerificatorPeluza();
    }

    public void setStrategie(IVerificator strategie) {
        this.strategie = strategie;
    }

    public void verificaSuporter(String numeSuporter) {
        this.strategie.verificare(numeSuporter);
    }
}
