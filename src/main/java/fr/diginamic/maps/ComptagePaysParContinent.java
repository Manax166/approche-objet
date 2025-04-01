package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {
    public static void main(String args[]) {
        List<Pays> listPays = new ArrayList<>();
        listPays.add(new Pays("France", "65 millions d’habitants", "Europe"));
        listPays.add(new Pays("Allemagne", "80 millions d’habitants", "Europe"));
        listPays.add(new Pays("Belgique", "10 millions d’habitants", "Europe"));
        listPays.add(new Pays("Russie", "150 millions d’habitants", "Asie"));
        listPays.add(new Pays("Chine", "1.4 milliards d’habitants", "Asie"));
        listPays.add(new Pays("Indonésie", "220 millions d’habitants", "Océanie"));
        listPays.add(new Pays("Australie", "20 millions d’habitants", "Océanie"));
        Map<String,Integer> mapContinent = new HashMap<>();
        for (Pays pays : listPays){
            String continent = pays.getContinent();
            if(mapContinent.containsKey(continent)){
                mapContinent.put(continent, 1);
            }else {
                mapContinent.put(continent,mapContinent.get(continent));
            }
        }
    }
}
