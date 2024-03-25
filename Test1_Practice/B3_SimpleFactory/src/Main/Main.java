package Main;

import Classes.SimpleFactory.SoupKitchen;
import Classes.SimpleFactory.SoupTypes;
import Classes.Soup;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        SoupKitchen kitchen = new SoupKitchen();
        Set<Soup>soups = new HashSet<>();

        soups.add(kitchen.cookSoup(SoupTypes.Beef, 300, 400));
        soups.add(kitchen.cookSoup(SoupTypes.Mushrooms, 200, 250));
        soups.add(kitchen.cookSoup(SoupTypes.Vegetables, 300,500));

        System.out.println(soups);
    }
}
