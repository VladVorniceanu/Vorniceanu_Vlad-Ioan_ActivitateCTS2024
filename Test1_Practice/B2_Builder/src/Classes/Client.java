package Classes;

public class Client {
    public boolean isWindowTable;
    public boolean isNiceChair;
    public boolean isTableArranged;
    public boolean isMusicPersonalised;
    public String clientName;
    public int numberOfPeople;

    public Client(String clientName, int numberOfPeople) {
        this.clientName = clientName;
        if(numberOfPeople>=1 && numberOfPeople <=8) {
            this.numberOfPeople = numberOfPeople;
        } else {
            throw new RuntimeException("Adjust the numebr of people to be between 1 and 8");
        }
        isMusicPersonalised = false;
        isNiceChair = false;
        isTableArranged = false;
        isWindowTable = false;
    }

    public void setWindowTable(boolean windowTable) {
        isWindowTable = windowTable;
    }

    public void setNiceChair(boolean niceChair) {
        isNiceChair = niceChair;
    }

    public void setTableArranged(boolean tableArranged) {
        isTableArranged = tableArranged;
    }

    public void setMusicPersonalised(boolean musicPersonalised) {
        isMusicPersonalised = musicPersonalised;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public void setNumberOfPeople(int numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    @Override
    public String toString() {
        return "Client{" +
                "isWindowTable=" + isWindowTable +
                ", isNiceChair=" + isNiceChair +
                ", isTableArranged=" + isTableArranged +
                ", isMusicPersonalised=" + isMusicPersonalised +
                ", clientName='" + clientName + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                '}';
    }
}
