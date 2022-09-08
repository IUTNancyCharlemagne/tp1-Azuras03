import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tp1.Money;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMoney {

    Money m1;
    Money m2;

    @BeforeEach
    public void initTest() {
        m1 = new Money(20, "EUR");
        m2 = new Money(20, "EUR");
    }

    @Test
    public void test_ajouter_money() {
        Money m3 = m1.add(m2);
        assertEquals(40, m3.getMontant());
    }
}
