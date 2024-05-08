import java.util.Objects;

public class Service extends Prestation{
//var
    private int nombre_heures;
    private int prix_heure;
    //con
    public Service(){

    }
    public Service(int id, String nom_projet, String nom_client, int prix_heure, int nombre_heures){
        super(id, nom_projet, nom_client);
        this.prix_heure = prix_heure;
        this.nombre_heures = nombre_heures;
    }

    public int getNombre_heures() {
        return nombre_heures;
    }


    public int getPrix_heure() {
        return prix_heure;
    }

    
  

   

}
