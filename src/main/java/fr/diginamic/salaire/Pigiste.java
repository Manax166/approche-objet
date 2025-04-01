package fr.diginamic.salaire;

public class Pigiste extends Intervenant{
    private int joursTravailles;
    private double salaire;
    public Pigiste(String nom, String prenom, double salaireJournalier, int joursTravailles) {
        super(nom, prenom);
        this.salaire = salaireJournalier;
        this.joursTravailles = joursTravailles;
    }

    @Override
    public double getSalaire() {
        return salaire;
    }

    @Override
    public void afficherDonnees() {
        System.out.println(this.getNom()+ ", " + this.getPrenom() + ", " + this.salaire*this.joursTravailles + ", Pigiste" );
    }
}
