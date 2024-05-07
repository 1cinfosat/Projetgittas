import java.util.Objects;

public sealed class Prestation permits Service, Produit {
    //var
    protected int id;
    protected String nom_projet, nom_client;
}
