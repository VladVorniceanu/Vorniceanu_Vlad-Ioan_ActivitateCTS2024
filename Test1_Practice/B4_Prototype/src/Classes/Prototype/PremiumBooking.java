package Classes.Prototype;

import Classes.Client;

import java.util.HashMap;
import java.util.Map;

public class PremiumBooking implements BookingPrototype {
    public Client client;
    public int tableNumber;
    public int nrOfPeople;
    public int day;
    public boolean isWindowTable;
    public boolean isOpenBar;
    public Map<String, Integer> mealsQuantity = new HashMap<>();

    public PremiumBooking() {
    }

    public PremiumBooking(Client client, int tableNumber, int nrOfPeople, int day, boolean isWindowTable, boolean isOpenBar, Map<String, Integer> mealsQuantity) {
        this.tableNumber = tableNumber;
        this.nrOfPeople = nrOfPeople;
        this.day = day;
        this.client = client;
        this.isWindowTable = isWindowTable;
        this.isOpenBar = isOpenBar;
        this.mealsQuantity = mealsQuantity;
    }

    @Override
    public String toString() {
        return "PremiumBooking{" +
                "client=" + client +
                ", tableNumber=" + tableNumber +
                ", nrOfPeople=" + nrOfPeople +
                ", day=" + day +
                ", isWindowTable=" + isWindowTable +
                ", isOpenBar=" + isOpenBar +
                ", mealsQuantity=" + mealsQuantity +
                '}';
    }

    @Override
    public BookingPrototype clone() {
        PremiumBooking newBooking = new PremiumBooking();
        newBooking.client = this.client;
        newBooking.tableNumber = this.tableNumber;
        newBooking.nrOfPeople = this.nrOfPeople;
        newBooking.day = this.day;
        newBooking.isWindowTable = this.isWindowTable;
        newBooking.isOpenBar = this.isOpenBar;
        for(String mealName:this.mealsQuantity.keySet()) {
            newBooking.mealsQuantity
                    .put(mealName, this.mealsQuantity.get(mealName));
        }
        return newBooking;
    }

    public void setClient(Client client) {
        this.client = client;
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

    public void setWindowTable(boolean windowTable) {
        isWindowTable = windowTable;
    }

    public void setOpenBar(boolean openBar) {
        isOpenBar = openBar;
    }

    public void setMealsQuantity(Map<String, Integer> mealsQuantity) {
        this.mealsQuantity = mealsQuantity;
    }

    public void addMeal(String mealName, Integer nrOfPortions) {
        this.mealsQuantity.put(mealName, nrOfPortions);
    }
}
