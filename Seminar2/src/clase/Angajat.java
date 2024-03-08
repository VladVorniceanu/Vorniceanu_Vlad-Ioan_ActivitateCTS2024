package clase;
import java.util.Arrays;

public class Angajat extends Aplicant{
	private String ocupatie;
	private int salariu;

	public Angajat() {
		super();
	}

	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}

	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return "Angajat: Nume=" + nume + ", Prenume=" + prenume
				+ ", Varsta=" + varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	@Override
	public void afisareBugetPeZi(int bugetPeZi) {
		// TODO Auto-generated method stub
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+bugetPeZi+" Euro/zi in proiect.");
	}
}
