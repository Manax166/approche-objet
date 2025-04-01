package sets;

public class Pays {
    private String nom;
    private  int hab;
    private double pibHab;
    public Pays(String nom, int hab, double pibHab) {
        this.nom = nom;
        this.hab = hab;
        this.pibHab = pibHab;
    }

    public String getNom() {
        return nom;
    }

    public int getHab() {
        return hab;
    }

    public double getPibHab() {
        return pibHab;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
