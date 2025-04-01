package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VilleplusPeupleesFranceService extends MenuService{

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Voici les villes les plus peuplées de france");
        List<Ville> villes = recensement.getListVilles();
        villes.sort(Comparator.comparing(Ville::getPopTotale));
        for(int i = villes.size()-1; i>villes.size()-11; i--){
            Ville ville = villes.get(i);
            System.out.println(ville.getNomCommune() + " " + ville.getPopTotale());
        }
    }
}
