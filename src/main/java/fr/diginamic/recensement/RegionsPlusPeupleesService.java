package fr.diginamic.recensement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RegionsPlusPeupleesService extends MenuService{
    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        HashMap<String, Integer> regions = new HashMap<>();
        PopRegionService prs = new PopRegionService();
        for(Ville ville : recensement.getListVilles()){
            if(!regions.containsKey(ville.getNomRegion()))
                regions.put(ville.getNomRegion(), prs.regionTotalCount(recensement, ville.getCodeRegion()));
        }
        List<Map.Entry<String, Integer>> result = regions.entrySet().stream()
                .sorted((k1, k2) -> k2.getValue().compareTo(k1.getValue()))
                .toList();
        for(int i = 0; i< 10; i++){
            Map.Entry<String, Integer> ville = result.get(i);
            System.out.println(ville.getKey() + " " + ville.getValue());
        }
    }
}
