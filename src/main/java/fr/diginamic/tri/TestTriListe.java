package fr.diginamic.tri;

import listes.Ville;

import java.util.ArrayList;
import java.util.List;

public class TestTriListe {
    public static void main(String[] args){
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));
        villes.sort(Ville::compareTo);
        for( Ville ville : villes){
            System.out.println(ville.getNom() + " | " + ville.getNbHab());
        }
    }
}
