package entites2;

import entites.AdressePostale;

public class Personne {
    private String nom;
    private String prenom;
    private AdressePostale adresse;
    public Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }
    public void display(){
        System.out.println(this.nom.toUpperCase() + " " + this.prenom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }
}
