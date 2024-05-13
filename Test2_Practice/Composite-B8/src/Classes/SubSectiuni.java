package Classes;

import java.util.ArrayList;
import java.util.List;

public class SubSectiuni extends SectiuneMeniu {

    List<SectiuneMeniu> itemsMeniu;

    public SubSectiuni(String numeSectiune) {
        super(numeSectiune);
        this.itemsMeniu = new ArrayList<>();
    }

    @Override
    public void addSectiune(SectiuneMeniu sectiuneNoua) {
        itemsMeniu.add(sectiuneNoua);
    }

    @Override
    public SectiuneMeniu getSectiune(int index) {
        return itemsMeniu.get(index);
    }

    @Override
    public void delecteSectiune(SectiuneMeniu sectiuneDeSters) {
        itemsMeniu.remove(sectiuneDeSters);
    }

    @Override
    public void afiseazaSectiune(String nivelIndentare) {
        System.out.println(nivelIndentare + super.numeSectiune + ":");
        for( SectiuneMeniu item : itemsMeniu ) {
            item.afiseazaSectiune(nivelIndentare+"\t");
        }
    }
}
