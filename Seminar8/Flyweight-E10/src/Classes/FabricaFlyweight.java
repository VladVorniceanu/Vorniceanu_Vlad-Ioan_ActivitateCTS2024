package Classes;

import java.util.HashMap;
import java.util.Map;

public class FabricaFlyweight{
    private Map<String, IFlyweight> spectatori;

    public FabricaFlyweight() {
        this.spectatori = new HashMap<>();
    }

    public IFlyweight getSpectator(int latime, int inaltime) {
        String cheie = String.valueOf(latime) + "_" + String.valueOf(inaltime);
        IFlyweight flyweight = spectatori.get(cheie);
        if(flyweight == null) {
            flyweight = new Spectator(inaltime, latime);
            spectatori.put(cheie, flyweight);
        }
        return spectatori.get(cheie);
    }
}
