import java.util.Objects;

public class Produit extends Prestation{

    //Att
    //var
    private int prix_total;
    private String date_livraison;
    //con
    public Produit() {

    }

    //parameterized constructor


    public Produit(int prix_total, String date_livraison) {
        this.prix_total = prix_total;
        this.date_livraison = date_livraison;
    }

    //Method
    public void DeleteProduct(){


    }
    //Equals && Hashcode


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Produit produit = (Produit) o;
        return prix_total == produit.prix_total && Objects.equals(date_livraison, produit.date_livraison);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prix_total, date_livraison);
    }

}
