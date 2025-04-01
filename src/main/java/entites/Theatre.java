package entites;

public class Theatre {
    private String nom;
    private int capaciteMax;
    private int totalClients;
    private double totalRecette;
    public void inscrire(int clients, double prixPlace){
        if(totalClients + clients > capaciteMax) {
            System.out.println("Erreur : le nombre d'inscriptions dépasse la capacité maximale");
            return;
        }
        totalClients += clients;
        totalRecette += prixPlace*clients;
    }

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalRecette = 0.0;
        this.totalClients = 0;
    }
    public double getTotalRecette() {
        return totalRecette;
    }

    public int getTotalClients() {
        return totalClients;
    }
}
