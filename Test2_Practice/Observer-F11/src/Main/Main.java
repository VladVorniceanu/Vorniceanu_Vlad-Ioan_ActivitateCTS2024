package Main;

import Classes.Abonati;
import Classes.Autobuz;
import Classes.Calatori;
import Classes.MonitorTraficStb;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Abonati abonat1 = new Calatori("Vlad");
        Abonati abonat2 = new Calatori("Vlad2");
        Abonati abonat3 = new Calatori("Vlad3");
        Abonati monitor1 = new MonitorTraficStb("Albert");
        Abonati monitor2 = new MonitorTraficStb("Mihai");

        List<Abonati> abonatiList = new ArrayList<>();
        abonatiList.add(abonat1);
        abonatiList.add(abonat2);
        abonatiList.add(abonat3);
        abonatiList.add(monitor1);
        abonatiList.add(monitor2);

        Autobuz autobuz1 = new Autobuz(new ArrayList<>(abonatiList), 102);
        autobuz1.pleacaAutobuzul();
        autobuz1.intarzieAutobuzul();

        autobuz1.abonare(new Calatori("Vasile"));
        autobuz1.dezabonare(monitor2);
        autobuz1.pleacaAutobuzul();

        Autobuz autobuz2 = new Autobuz(new ArrayList<>(abonatiList), 235);
        autobuz2.pleacaAutobuzul();
    }
}