package Classes;

public class MonitorTraficStb implements Abonati {

    String numeMonitor;

    public MonitorTraficStb(String numeMonitor) {
        this.numeMonitor = numeMonitor;
    }

    @Override
    public void notificare(String mesaj) {
        System.out.println("Stimate monitor " + this.numeMonitor + ",\nCalatorii abonati au fost informati:\n\t\t " + mesaj + "\n");
    }
}
