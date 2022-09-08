package tp1;

import java.util.Objects;

public class Money {
    private int montant;
    private String devise;

    /**
     * @param mon
     * @param dev
     */
    public Money(int mon, String dev) {
        this.montant = mon;
        this.devise = dev;
    }

    /**
     * @return
     */
    public int getMontant() {
        return this.montant;
    }

    /**
     * @return
     */
    public String getDevise() {
        return this.devise;
    }

    /**
     * @param m
     * @return
     */
    public Money add(Money m) {
        return new Money(this.getMontant()+m.getMontant(), this.getDevise());
    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob == null || getClass() != ob.getClass()) return false;
        Money money = (Money) ob;
        return montant == money.montant && Objects.equals(devise, money.devise);
    }

    @Override
    public int hashCode() {
        return Objects.hash(montant, devise);
    }

    @Override
    public String toString() {
        return "Money{" +
                "montant=" + montant +
                ", devise='" + devise + '\'' +
                '}';
    }
}
