package fr.diginamic.recensement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class VillePlusPeupleesDeptService extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("Saisissez le code d'un département");
        String codeDept = scanner.next();
        List<Ville> villesDuDept = new ArrayList<>();
        for(Ville ville : recensement.getListVilles()){
            if(ville.getCodeDepartement().equals(codeDept)) villesDuDept.add(ville);
        }
        villesDuDept.sort(Comparator.comparing(Ville::getPopTotale));
        for(int i = villesDuDept.size()-1; i>villesDuDept.size()-11; i--){
            Ville ville = villesDuDept.get(i);
            System.out.println(ville.getNomCommune() + " " + ville.getPopTotale());
        }
    }
}
