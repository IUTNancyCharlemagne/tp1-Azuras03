import java.util.Objects;

public class Money {
    private int montant;
    private String devise;

    /**
     * Constructeur de la classe Money
     * @param mon entier, le montant
     * @param dev chaîne, la devise en trois lettres (comme "EUR")
     */
    public Money(int mon, String dev) {
        this.montant = mon;
        this.devise = dev;
    }

    /**
     * Methode donnant le montant de l'argent courant
     * @return le montant entier de l'argent courant
     */
    public int getMontant() {
        return this.montant;
    }

    /**
     * Methode retournant la devise de l'argent courant
     * @return la devise
     */
    public String getDevise() {
        return this.devise;
    }

    /**
     * Methode permettant d'ajouter un montant d'argent
     * @param m l'argent a ajouter
     * @return le nouvel objet qui est la fusion des deux objets Money
     */
    public Money add(Money m) throws DeviseException {
        if(this.getDevise().equals(m.getDevise())) return new Money(this.getMontant()+m.getMontant(), this.getDevise());
        else throw new DeviseException("Les devises sont differentes, erreur." + "\n");
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
