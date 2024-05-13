package Main;

import Classes.DecoratorAnNou;
import Classes.INotaDePlata;
import Classes.NotaDePlata;

public class Main {
    public static void main(String[] args) {
        INotaDePlata notaDePlataNormala = new NotaDePlata("Mic Bucatar", 425.39);
        notaDePlataNormala.printeazaNotaDePlata();

        INotaDePlata notaDePlataDecorata = new DecoratorAnNou(notaDePlataNormala);
        notaDePlataDecorata.printeazaNotaDePlata();
    }
}