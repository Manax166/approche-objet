package listes;

public class Ville implements Comparable<Ville>{
    String nom;
    int nbHab;

    public Ville(String nom, int nbHab) {
        this.nom = nom;
        this.nbHab = nbHab;
    }

    public String getNom() {
        return nom;
    }

    public int getNbHab() {
        return nbHab;
    }
    @Override
    public int compareTo(Ville o) {
        //return this.nom.compareTo(o.getNom());
        return  Integer.compare(this.nbHab, o.getNbHab());
    }

}
