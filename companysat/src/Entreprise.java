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



}
