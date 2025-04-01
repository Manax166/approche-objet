package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {
    public static void main(String[] args){
        String chaine = "Durand;Marcel;2 523.5";
        char premierCaractere = chaine.charAt(0);
        System.out.println("Premier caractère: " + premierCaractere);
        int length = chaine.length();
        System.out.println(length);
        int indexFirstSeparator = chaine.indexOf(';');
        System.out.println(indexFirstSeparator);
        String nomDeFamille = chaine.substring(0, indexFirstSeparator);
        System.out.println(nomDeFamille.toUpperCase());
        System.out.println(nomDeFamille.toLowerCase());
        String[] tab = chaine.split(";");
        for( String val : tab){
            System.out.println(val);
        }
        double salaire = Double.parseDouble(tab[2].replace(" ", ""));
        Salarie s = new Salarie(tab[0], tab[1], salaire);

    }
}
