package Classes;

public class RetetaCreme implements RetetaAbstracta {

    public int cantitate;
    public String nume;

    public RetetaCreme(int cantitate, String nume) {
        this.cantitate = cantitate;
        this.nume = nume;
    }

    public RetetaCreme() {
        this.cantitate = 0;
        this.nume = "N/A";
    }

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public RetetaAbstracta clone() {
        RetetaCreme retCreme = new RetetaCreme();
        retCreme.setNume(this.nume);
        retCreme.setCantitate(this.cantitate);
        return retCreme;
    }

    @Override
    public String toString() {
        return "RetetaCreme{" +
                "cantitate=" + cantitate +
                ", nume='" + nume + '\'' +
                '}';
    }
}
