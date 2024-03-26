package Main;

import Classes.Client;
import Classes.Prototype.BookingPrototype;
import Classes.Prototype.NormalBooking;
import Classes.Prototype.PremiumBooking;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        NormalBooking booking1 = new NormalBooking(new Client("Coco","0740123456"),2,3,25);
        BookingPrototype booking2 = booking1.clone();

        Map<String,Integer> mealsForPremium = new HashMap<>();
        mealsForPremium.put("Wagyu Steak",3);
        mealsForPremium.put("Sushi",2);
        PremiumBooking premiumBooking = new PremiumBooking(new Client("Mumu","555"),
                1,
                5,
                5,
                true,
                true,
                mealsForPremium);
        BookingPrototype premiumBooking2 = premiumBooking.clone();
//        premiumBooking2

        System.out.println(booking1);
        System.out.println(booking2);
        System.out.println(premiumBooking2);
        System.out.println(premiumBooking);
        System.out.println("\n");
    }
}
