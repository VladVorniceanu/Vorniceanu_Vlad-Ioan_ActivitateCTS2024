package Main;

import Classes.FactoryMethod.ISoupFactory;
import Classes.FactoryMethod.SupaCiupierciFactory;
import Classes.FactoryMethod.SupaLegumaFactory;
import Classes.FactoryMethod.SupaVitaFactory;
import Classes.Supa;
import Classes.SupaLeguma;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        SupaVitaFactory supaVitaFactory = new SupaVitaFactory();
        SupaLegumaFactory supaLegumaFactory = new SupaLegumaFactory();
        SupaCiupierciFactory supaCiupierciFactory = new SupaCiupierciFactory();

        Set<Supa> supe = new HashSet<>();
        supe.add(supaCiupierciFactory.cookSoup(230));
        supe.add(supaLegumaFactory.cookSoup(100));
        supe.add(supaVitaFactory.cookSoup(300));
        supe.add(supaVitaFactory.cookSoup(321));

        System.out.println(supe);
    }
}
