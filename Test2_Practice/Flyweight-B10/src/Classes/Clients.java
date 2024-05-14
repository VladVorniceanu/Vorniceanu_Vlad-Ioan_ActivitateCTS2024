package Classes;

public class Clients implements IClients {
    String name;
    String telephone;

    public Clients(String name, String telephone) {
        this.name = name;
        this.telephone = telephone;
    }

    @Override
    public void booking(Booking booking) {
        System.out.println("Client " + this.name +
                ", telephone: " + this.telephone +
                ", made a booking for " + booking.nrOfPeople + (booking.nrOfPeople>1 ? " people" : " person") +
                ", hour: " + booking.hour + ".");
    }
}
