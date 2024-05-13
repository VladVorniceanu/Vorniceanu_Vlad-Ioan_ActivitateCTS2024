package Classes;

public class NotaDePlata implements INotaDePlata{

    String numeRestaurant;
    Double totalDePlata;

    public NotaDePlata(String numeRestaurant, Double totalDePlata) {
        this.numeRestaurant = numeRestaurant;
        this.totalDePlata = totalDePlata;
    }

    @Override
    public void printeazaNotaDePlata() {
        System.out.println("Aveti de plata suma de : " + this.getTotalDePlata() + " RON. \nVa multumim pentru vizita! Restaurant " + this.getNumeRestaurant());
    }

    public String getNumeRestaurant() {
        return numeRestaurant;
    }

    public Double getTotalDePlata() {
        return totalDePlata;
    }
}
