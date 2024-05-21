package Classes;

import org.junit.Test;

import static org.junit.Assert.*;

public class PersoanaTest {
    @org.junit.Test
    public void getSexReturnRightM() {
        Persoana pers1 = new Persoana("Vlad", "5020127333999");
        assertEquals("M", pers1.getSex());
    }

    @org.junit.Test
    public void getSexReturnRightF() {
        Persoana pers2 = new Persoana("pers2", "2020127333999");
        assertEquals("F", pers2.getSex());
    }

    @Test
    public void getSexHighBoundary() {
        Persoana persoana = new Persoana("pers2", "6020127333999");
        assertEquals("F", persoana.getSex());
    }

    @Test
    public void getSexLowBoundary() {
        Persoana persoana = new Persoana("persoana", "1010203123456");
        assertEquals("M", persoana.getSex());
    }

    @Test
    public void getSexCrossCheckM() {
        String cnp = "3029562842312";
        Persoana persoana = new Persoana("persoana", cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0)) % 2 == 0) {
            sex = "F";
        } else {
            sex = "M";
        }
        assertEquals(sex, persoana.getSex());
    }
    @Test
    public void getSexCrossCheckF() {
        String cnp = "4029562842312";
        Persoana persoana = new Persoana("persoana", cnp);
        String sex;
        if(Integer.valueOf(cnp.charAt(0)) % 2 == 0) {
            sex = "F";
        } else {
            sex = "M";
        }
        assertEquals(sex, persoana.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorOutOfRange() {
        Persoana persoana = new Persoana("persoana", "9020127333999");
        persoana.getSex();
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexErrorInvalidChar() {
        Persoana persoana = new Persoana("persoana", "h83");
        persoana.getSex();
    }

    @Test(expected = NullPointerException.class)
    public void getSexErrorNullString() {
        Persoana persoana = new Persoana("persoana", null);
        persoana.getSex();
    }

    @Test(expected = NullPointerException.class)
    public void getSexError() {
        Persoana persoana = new Persoana("persoana", "");
        persoana.getSex();
    }

    @Test(timeout = 5)
    public void getSexPerformance() {
        Persoana persoana = new Persoana("persoana", "5020127330330");
        persoana.getSex();
    }

    @Test
    public void getSexConformance1Char() {
        Persoana persoana = new Persoana("persoana", "5020127333999");
        assertEquals(1, persoana.getSex().length());
    }

    @Test
    public void getSexConformanceMorF() {
        Persoana persoana = new Persoana("persoana", "5020127333999");
        boolean isCorrect = persoana.getSex().equals("M") || persoana.getSex().equals("F");
        assertTrue(isCorrect);
    }

    @Test
    public void getSexOrdering() {
        Persoana pers1 = new Persoana("pers", "123");
        Persoana pers2 = new Persoana("pers2", "234");
        boolean isCorrect = pers1.getSex().compareTo(pers2.getSex()) > 0;
        assertTrue(isCorrect);
    }

    @Test
    public void getSexUpperRangeBound() {
        Persoana pers1 = new Persoana("pers", "89");
        assertEquals("F", pers1.getSex());
    }

    @Test(expected = IllegalArgumentException.class)
    public void getSexCardinality0() {
        Persoana pers1 = new Persoana("pers", "0123456789123");
        pers1.getSex();
    }
}