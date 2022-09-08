import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestMoney {

    Money m1;
    Money m2;
    Money m3;

    @BeforeEach
    public void initTest() {
        m1 = new Money(20, "EUR");
        m2 = new Money(20, "EUR");
        m3 = new Money(0, "DOL");
    }

    @Test
    public void test_ajouter_money_meme_devise() {
        m2 = m1.add(m2);
        assertEquals(40, m2.getMontant());
    }

    @Test
    public void test_ajouter_money_devise_diff() {
        m3 = m1.add(m3);
        assertEquals(20, m3.getMontant());
    }

    @Test
    public void test_equals_money_true() {
        assertTrue(m1.equals(m2));
    }

    @Test
    public void test_equals_money_false() {
        assertTrue(!m1.equals(m3));
    }

    @Test
    public void test_get_montant() {
        assertEquals(20, m1.getMontant());
    }

    @Test
    public void test_get_devise() {
        assertEquals("EUR", m1.getDevise());
    }
}
