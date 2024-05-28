package Teste;

import Classes.PachetTuristic;
import Classes.Persoana;
import Teste.Categorii.Mock;
import Teste.Categorii.WithoutMock;
import Teste.Dubluri.ClientFake;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.*;

public class PachetTuristicTest {

    @Test
    @Category(WithoutMock.class)
    public void aplicaDiscountVarstniciCorectitudine() {
        PachetTuristic pachetTuristic = new PachetTuristic(new Persoana("Persoana","1400127330184"), "Destinatie", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pret = pachetTuristic.getPret();
        assertEquals(900.0, pret, 0.1);
    }

    @Test
    @Category(WithoutMock.class)
    public void aplicaDiscountBoundary() {
        PachetTuristic pachetTuristic = new PachetTuristic(new Persoana("pers", "1590513947123"), "unk", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pret = pachetTuristic.getPret();
        assertEquals(900.0, pret, 0.1);
    }

    @Test
    @Category(Mock.class)
    public void aplicaDiscountVarstaFake() {
        PachetTuristic pachetTuristic = new PachetTuristic(new ClientFake("M",65, true), "unk", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pret = pachetTuristic.getPret();
        assertEquals(900.0, pret, 0.1);
    }

    @Test
    @Category(Mock.class)
    public void aplicaDiscountFalsVarstaFake() {
        PachetTuristic pachetTuristic = new PachetTuristic(new ClientFake("M",45, true), "unk", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(10);
        double pret = pachetTuristic.getPret();
        assertEquals(1000.0, pret, 0.1);
    }

    @Test
    @Category(Mock.class)
    public void aplicaDiscountVarsta100() {
        PachetTuristic pachetTuristic = new PachetTuristic(new ClientFake("M",65, true), "unk", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(100);
        double pret = pachetTuristic.getPret();
        assertEquals(0.0, pret, 0.1);
    }

    @Test
    @Category(Mock.class)
    public void aplicaDiscountVarsta0() {
        PachetTuristic pachetTuristic = new PachetTuristic(new ClientFake("M",65, true), "unk", 1000.0);
        pachetTuristic.aplicaDiscountVarstnici(0);
        double pret = pachetTuristic.getPret();
        assertEquals(1000.0, pret, 0.1);
    }

    @Test
    @Category(Mock.class)
    public void aplicaDiscountVarsta1() {
        PachetTuristic pachetTuristic = new PachetTuristic(new ClientFake("M",65, true), "unk", 100.0);
        pachetTuristic.aplicaDiscountVarstnici(1);
        double pret = pachetTuristic.getPret();
        assertEquals(99.0, pret, 0.1);
    }
}