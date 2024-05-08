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
        //diplay
        System.out.println("Services : " + serviceCount + "\nProduits : " + productCount);
    }

    //TO DO 5
    public List<Prestation> prestationparClient(String client){
        List<Prestation> l = new ArrayList<>();
        for (Prestation p: prestations
        ) {
            if (p.nom_client.equals(client)){
                l.add(p);
            }
        }
        return l;
    }

    //TO DO 6
    public Map<String, List<Prestation>> filterParClient(){
        return prestations.stream().collect(Collectors.groupingBy(Prestation::getNom_client));
    }

    //TO DO 7
    public List<String> afficherProjects(){
        return prestations.stream().map(e-> e.getNom_projet()).distinct().sorted().collect(Collectors.toList());
    }
    public Map<Service, Integer> recupererServices() {

        Map<Service, Integer> services = new HashMap<>();
        Function<Service, Integer> fun = e -> e.getPrix_heure() * e.getNombre_heures();
        for (Prestation p: prestations) {
            if(p instanceof Service s){
                services.put(s, fun.apply(s));
            }
        }

        return services;
    }



}
