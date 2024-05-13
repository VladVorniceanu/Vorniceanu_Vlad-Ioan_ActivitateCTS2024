package Classes;

import java.util.ArrayList;
import java.util.List;

public class SectiuniMancaruriSiBauturi extends SectiuneMeniu {

    public SectiuniMancaruriSiBauturi(String numeSectiune) {
        super(numeSectiune);
        this.subSectiuni = new ArrayList<>();
    }

    List<SectiuneMeniu> subSectiuni;
    @Override
    public void addSectiune(SectiuneMeniu sectiuneNoua) {
        this.subSectiuni.add(sectiuneNoua);
    }

    @Override
    public SectiuneMeniu getSectiune(int index) {
        return subSectiuni.get(index);
    }

    @Override
    public void delecteSectiune(SectiuneMeniu sectiuneDeSters) {
        subSectiuni.remove(sectiuneDeSters);
    }

    @Override
    public void afiseazaSectiune(String nivelIndentare) {
        System.out.println(nivelIndentare + "Sectiunea " + super.numeSectiune + " cuprinde:");
        for (SectiuneMeniu sectiune : subSectiuni) {
            sectiune.afiseazaSectiune(nivelIndentare+"\t");
        }
    }
}
