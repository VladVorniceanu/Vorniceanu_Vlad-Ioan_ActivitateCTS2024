package Classes.Prototype;

import Classes.Client;

public class NormalBooking implements BookingPrototype {
    public int tableNumber;
    public int nrOfPeople;
    public int day;
    public Client client;

    public NormalBooking(Client client, int tableNumber, int nrOfPeople, int day) {
        this.client = client;
        this.tableNumber = tableNumber;
        this.nrOfPeople = nrOfPeople;
        this.day = day;
    }

    public NormalBooking() {
        this.client = new Client();
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }

    public void setNrOfPeople(int nrOfPeople) {
        this.nrOfPeople = nrOfPeople;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    @Override
    public String toString() {
        return "NormalBooking{" +
                "tableNumber=" + tableNumber +
                ", nrOfPeople=" + nrOfPeople +
                ", day=" + day +
                ", client=" + client +
                '}';
    }

    @Override
    public BookingPrototype clone() {
        NormalBooking clonedBooking = new NormalBooking();

        clonedBooking.client = this.client;
        clonedBooking.tableNumber = this.tableNumber;
        clonedBooking.nrOfPeople = this.nrOfPeople;
        clonedBooking.day = this.day;

        return clonedBooking;
    }
}
