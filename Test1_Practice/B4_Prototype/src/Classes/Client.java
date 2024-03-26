package Classes;

public class Client {
    public String clientName;
    public String telephone;


    public Client() {
        clientName = "N/A";
        telephone = "N/A";
    }

    public Client(String clientName, String telephone) {
        this.clientName = clientName;
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Client "
                + clientName
                + " has telephone: " + telephone;
    }
}
