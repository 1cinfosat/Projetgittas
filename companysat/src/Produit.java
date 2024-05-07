import java.util.Objects;

public class Produit extends Prestation{
    //var
    private int prix_total;
    private String date_livraison;


    //constructeur vide


    public Produit() {
    }

    //constructeur parametré


    public Produit(int prix_total, String date_livraison) {
        this.prix_total = prix_total;
        this.date_livraison = date_livraison;
    }

    //Getters && Setters


    public int getPrix_total() {
        return prix_total;
    }

    public void setPrix_total(int prix_total) {
        this.prix_total = prix_total;
    }

    public String getDate_livraison() {
        return date_livraison;
    }

    public void setDate_livraison(String date_livraison) {
        this.date_livraison = date_livraison;
    }

    //Display


    @Override
    public String toString() {
        return "Produit{" +
                "prix_total=" + prix_total +
                ", date_livraison='" + date_livraison + '\'' +
                '}';
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
