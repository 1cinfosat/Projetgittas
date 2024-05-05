import java.util.ArrayList;

public class Entreprise {

    List<Prestation> prestations = new ArrayList<>();

    //Methods
    //TO DO 3
    public void ajouterPrestation(Prestation p) throws PrestationExisteException{
        if(prestations.contains(p)){
            throw new PrestationExisteException("Cette prestation existe deja!");
        }else{
            prestations.add(p);
        }
    }

    //TO DO 4
    public void afficherNbrPrestation(){
        int productCount = 0;
        int serviceCount = 0;
        for (Prestation p: prestations) {
            if(p instanceof Service){
                serviceCount++;
            }
            if (p instanceof Produit ){
                productCount++;
            }
        }

}
