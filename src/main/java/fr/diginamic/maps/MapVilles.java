package fr.diginamic.maps;

import listes.Ville;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;

public class MapVilles {
    public static void main(String args[]) {
        HashMap<String, Ville> mapVilles = new HashMap<>();
        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));
        for(Ville ville : villes){
            mapVilles.put(ville.getNom(),ville);
        }
        Ville villeMoinsPeuplee = null;
        for(Ville ville : mapVilles.values()){
            if(villeMoinsPeuplee == null || villeMoinsPeuplee.getNbHab()<ville.getNbHab()) villeMoinsPeuplee = ville;
        }
        mapVilles.remove(villeMoinsPeuplee.getNom());

    }
}
