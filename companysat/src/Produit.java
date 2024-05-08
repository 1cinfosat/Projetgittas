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

}
