package Main;

import Classes.ItemsMeniu;
import Classes.SectiuneMeniu;
import Classes.SectiuniMancaruriSiBauturi;
import Classes.SubSectiuni;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SectiuneMeniu meniu = new SectiuniMancaruriSiBauturi("Meniu principal");
        SectiuneMeniu mancaruri = new SectiuniMancaruriSiBauturi("Mancaruri");
        SectiuneMeniu bauturi = new SectiuniMancaruriSiBauturi("Bauturi");

        SectiuneMeniu aperitive = new SubSectiuni("Aperitive");
        SectiuneMeniu ciorbe = new SubSectiuni("Ciorbe");
        SectiuneMeniu mainCourses = new SubSectiuni("Feluri principale");
        SectiuneMeniu deserturi = new SubSectiuni("Deserturi");
        SectiuneMeniu softDrinks = new SubSectiuni("Soft Drinks");
        SectiuneMeniu alcohol = new SubSectiuni("Alcoolice");

        SectiuneMeniu bruschete = new ItemsMeniu("Bruschete");
        SectiuneMeniu antipasti = new ItemsMeniu("Antipasti");
        SectiuneMeniu vacuta = new ItemsMeniu("Ciorba de vacuta");
        SectiuneMeniu perisoare = new ItemsMeniu("Ciorba de perisoare");
        SectiuneMeniu legume = new ItemsMeniu("Ciorba de legume");
        SectiuneMeniu friptura = new ItemsMeniu("Friptura");
        SectiuneMeniu gratar = new ItemsMeniu("Gratar");
        SectiuneMeniu papanasi = new ItemsMeniu("Papanasi");
        SectiuneMeniu gogosi = new ItemsMeniu("Gogosi");
        SectiuneMeniu clatite = new ItemsMeniu("Clatite");
        SectiuneMeniu apa = new ItemsMeniu("Apa");
        SectiuneMeniu cola = new ItemsMeniu("Coca Cola");
        SectiuneMeniu sprite = new ItemsMeniu("Sprite");
        SectiuneMeniu margarita = new ItemsMeniu("Margarita");
        SectiuneMeniu whisky = new ItemsMeniu("Jack Daniel's");

        alcohol.addSectiune(margarita);
        alcohol.addSectiune(whisky);
        softDrinks.addSectiune(apa);
        softDrinks.addSectiune(cola);
        softDrinks.addSectiune(sprite);
        deserturi.addSectiune(clatite);
        deserturi.addSectiune(gogosi);
        deserturi.addSectiune(papanasi);
        mainCourses.addSectiune(gratar);
        mainCourses.addSectiune(friptura);
        ciorbe.addSectiune(vacuta);
        ciorbe.addSectiune(perisoare);
        ciorbe.addSectiune(legume);
        aperitive.addSectiune(bruschete);
        aperitive.addSectiune(antipasti);

        mancaruri.addSectiune(aperitive);
        mancaruri.addSectiune(ciorbe);
        mancaruri.addSectiune(mainCourses);
        mancaruri.addSectiune(deserturi);
        bauturi.addSectiune(softDrinks);
        bauturi.addSectiune(alcohol);

        meniu.addSectiune(mancaruri);
        meniu.addSectiune(bauturi);

        meniu.afiseazaSectiune("\t");

        mancaruri.getSectiune(2).afiseazaSectiune("");
        aperitive.delecteSectiune(antipasti);

        meniu.afiseazaSectiune("");

    }
}