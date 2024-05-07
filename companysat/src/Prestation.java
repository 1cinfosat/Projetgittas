import java.util.Objects;

public sealed class Prestation permits Service, Produit {
    //var
    protected int id;
    protected String nom_projet, nom_client;

    public Prestation() {
    }

    public Prestation(int id, String nom_projet, String nom_client) {
        this.id = id;
        this.nom_projet = nom_projet;
        this.nom_client = nom_client;
    }

    
}
