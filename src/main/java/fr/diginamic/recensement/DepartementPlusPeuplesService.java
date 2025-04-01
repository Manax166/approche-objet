package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DepartementPlusPeuplesService extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        HashMap<String, Integer> departements = new HashMap<>();
        PopDepartementService pds = new PopDepartementService();
        for(Ville ville : recensement.getListVilles()){
            if(!departements.containsKey(ville.getCodeDepartement()))
                departements.put(ville.getCodeDepartement(), pds.departementTotalCount(recensement, ville.getCodeDepartement()));
        }
        List<Map.Entry<String, Integer>> result = departements.entrySet().stream()
                .sorted((k1, k2) -> k2.getValue().compareTo(k1.getValue()))
                .toList();
        for(int i = 0; i< 10; i++){
            Map.Entry<String, Integer> ville = result.get(i);
            System.out.println(ville.getKey() + " " + ville.getValue());
        }
    }
}
