import java.util.ArrayList;
import java.util.List;

public class MoneyList {
    private List<Money> list;

    /**
     * Constructeur de la classe MoneyList
     */
    public MoneyList() {
        list= new ArrayList<Money>();
    }

    /**
     * Methode permettant d'obtenir la liste des objets Money
     */
    public List<Money> getList() {
        return list;
    }

    /**
     * Methode permettant d'ajouter un objet Money a la liste
     * @param m l'objet Money a ajouter
     */
    public void ajouterSomme (Money m) throws DeviseException {
        for (Money money : list) {
            if (money.getDevise().equals(m.getDevise())) {
                money.add(m);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "MoneyList{" +
                "list=" + list +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MoneyList moneyList = (MoneyList) o;
        return list.equals(moneyList.list);
    }
}
