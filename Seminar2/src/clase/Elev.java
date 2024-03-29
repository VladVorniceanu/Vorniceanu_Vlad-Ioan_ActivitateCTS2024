package clase;
import java.util.Arrays;

public class Elev extends Aplicant{
	private int clasa;
	private String tutore;

	public Elev() {
		super();
	}

	public void setClasa(int i) {
		this.clasa = i;
	}

	public void setTutore(String tutore) {
		this.tutore = tutore;
	}

	@Override
	public String toString() {
		return "Elev: Nume=" + nume + ", Prenume=" + prenume + ", Varsta="
				+ varsta + ", Punctaj=" + punctaj + ", Nr_proiecte=" + nrProiecte + ", DenumireProiect="
				+ Arrays.toString(denumireProiect) + "Clasa=" + clasa + ", Tutore=" + tutore;
	}

	@Override
	public void afisareBugetPeZi(int bugetPeZi) {
		System.out.println("Angajatul "+getNume()+" "+getPrenume()+" primeste"+bugetPeZi+" Euro/zi in proiect.");
	}
}
