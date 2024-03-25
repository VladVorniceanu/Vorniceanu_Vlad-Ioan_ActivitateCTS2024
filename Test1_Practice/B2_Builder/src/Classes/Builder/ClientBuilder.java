package Classes.Builder;

import Classes.Client;

public class ClientBuilder implements AbstractBuilder{
    public Client client;
    @Override
    public Client build() {
        return this.client;
    }

    public ClientBuilder(String clientName, int noOfPeople) {
        this.client = new Client(clientName, noOfPeople);
    }

    public ClientBuilder setWindowTable(boolean windowTable) {
        this.client.isWindowTable = windowTable;
        return this;
    }

    public ClientBuilder setNiceChair(boolean niceChair) {
        this.client.isNiceChair = niceChair;
        return this;
    }

    public ClientBuilder setTableArranged(boolean tableArranged) {
        this.client.isTableArranged = tableArranged;
        return this;
    }

    public ClientBuilder setMusicPersonalised(boolean musicPersonalised) {
        this.client.isMusicPersonalised = musicPersonalised;
        return this;
    }
}
