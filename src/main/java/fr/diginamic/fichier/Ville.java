package fr.diginamic.fichier;

import java.util.Comparator;

public class Ville  implements Comparable<Ville>{
    private String nomVille;
    private String codeDept;
    private String nomRegion;
    private int popTotale;

    public Ville(String nomVille, String codeDept, String nomRegion, int popTotale) {
        this.nomVille = nomVille;
        this.codeDept = codeDept;
        this.nomRegion = nomRegion;
        this.popTotale = popTotale;
    }

    public String getNomVille() {
        return nomVille;
    }

    public String getCodeDept() {
        return codeDept;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    public int getPopTotale() {
        return popTotale;
    }
    @Override
    public String toString(){
        return nomVille+"; "+codeDept+"; "+nomRegion+"; "+popTotale+"\n";
    }


    @Override
    public int compareTo(Ville o) {
        return Integer.compare(o.getPopTotale(), this.popTotale);
    }
}
