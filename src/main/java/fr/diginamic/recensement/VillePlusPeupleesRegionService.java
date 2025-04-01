package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VillePlusPeupleesRegionService extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Saisissez le code d'une région");
        int codeRegion = scanner.nextInt();
        List<Ville> villesRegion = new ArrayList<>();
        for(Ville ville : recensement.getListVilles()){
            if(ville.getCodeRegion() == codeRegion) villesRegion.add(ville);
        }
        villesRegion.sort(Comparator.comparing(Ville::getPopTotale));
        for(int i = villesRegion.size()-1; i>villesRegion.size()-11; i--){
            Ville ville = villesRegion.get(i);
            System.out.println(ville.getNomCommune() + " " + ville.getPopTotale());
        }
    }
}
