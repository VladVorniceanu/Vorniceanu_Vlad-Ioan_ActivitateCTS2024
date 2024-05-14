package Classes;

public class Calatori implements Abonati {

    String numeCalator;

    public Calatori(String numeCalator) {
        this.numeCalator = numeCalator;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Stimate calator " + this.numeCalator + ",\nAi primit de la STB mesajul:\n\t" + mesaj + '\n');
    }
}
