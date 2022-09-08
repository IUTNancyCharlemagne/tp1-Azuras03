import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
    public void test_ajouter_money_meme_devise() throws DeviseException {
        m2 = m1.add(m2);
        assertEquals(40, m2.getMontant());
    }

    @Test
    public void test_ajouter_money_devise_diff() {
        assertThrows(DeviseException.class, () -> m3.add(m1));
    }

    @Test
    public void test_equals_money_true() {
        assertEquals(m1, m2);
    }

    @Test
    public void test_equals_money_false() {
        assertFalse(m1.equals(m3));
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
