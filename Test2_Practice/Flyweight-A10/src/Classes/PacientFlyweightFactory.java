package Classes;

import java.util.HashMap;
import java.util.Map;

public class PacientFlyweightFactory {
    private HashMap<String, IPacient> pacienti;

    public PacientFlyweightFactory() {
        this.pacienti = new HashMap<>();
    }

    public int getNrPacienti() {
        return pacienti.size();
    }

    public IPacient getPacient(String nume, String telefon, String adresa, int varsta) {
        String key = nume + '_' + telefon;
        IPacient pacient = pacienti.get(key);
        if(pacient == null) {
            pacient = new Pacient(nume, telefon, adresa, varsta);
            pacienti.put(key,pacient);
        }
        return pacient;
    }
}
