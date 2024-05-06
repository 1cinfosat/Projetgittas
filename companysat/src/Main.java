public class Main {
    public static void main(String [] args) {
        //var
        Entreprise entreprise = new Entreprise();

        //Data
        entreprise.prestations.add(new Prestation(1, "Bolt App", "Bolt Inc"));
        entreprise.prestations.add(new Service(2, "Formation Flutter", "Orange Tunisie", 36, 100));
        entreprise.prestations.add(new Service(3,"Consulting Architecture", "Avaxia", 87, 150));
        entreprise.prestations.add(new Produit(4, "E-learning Platform", "MSB", 15200, "12/2022"));
        entreprise.prestations.add(new Produit(5,"Social Network App", "Orange Tunisie", 8800, "03/2023"));
        entreprise.prestations.add(new Produit(6,"Scanner de cheque", "BNA", 12600, "12/2023"));
    }
}