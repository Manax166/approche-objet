package fr.diginamic.maps;

public class Pays {
    String nom;
    String nbHab;
    String continent;

    public Pays(String nom, String nbHab, String continent) {
        this.nom = nom;
        this.nbHab = nbHab;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public String getNbHab() {
        return nbHab;
    }

    public String getContinent() {
        return continent;
    }
}
