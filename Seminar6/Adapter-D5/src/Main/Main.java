package Main;

import Classes.*;

public class Main {
    public static void main(String[] args) {
        ICrediteLeasing crediteLeasing = new CrediteLeasing("Anton", 100000, 30);
        crediteLeasing.oferireCrediteLeasing();

        ICrediteLeasing crediteLeasingFramework = new FrameworkCrediteLeasing(new Credit("Razvan", 100000, 100, 2000,  980));
        crediteLeasingFramework.oferireCrediteLeasing();
    }
}