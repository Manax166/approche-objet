package sets;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class TestSetPays {
    public static void main(String args[]) {
        HashSet<Pays> paysSet = new HashSet<>();
        paysSet.add(new Pays("USA", 331_000_000, 68_308.57));
        paysSet.add(new Pays("France", 67_000_000, 40_494.24));
        paysSet.add(new Pays("Allemagne", 83_000_000, 50_206.49));
        paysSet.add(new Pays("UK", 67_000_000, 42_329.66));
        paysSet.add(new Pays("Italie", 60_000_000, 34_396.64));
        paysSet.add(new Pays("Japon", 126_000_000, 40_247.07));
        paysSet.add(new Pays("Chine", 1_440_000_000, 10_604.46));
        paysSet.add(new Pays("Russie", 146_000_000, 11_666.92));
        paysSet.add(new Pays("Inde", 1_390_000_000, 2_190.96));
        System.out.println(paysSet.stream().max(Comparator.comparingInt(Pays::getHab)).get().getNom());
        System.out.println(paysSet.stream().max(Comparator.comparingDouble(Pays::getPibHab)).get().getNom());
        Pays min = paysSet.stream().min(Comparator.comparingDouble(Pays::getPibHab)).get();
        min.setNom(min.getNom().toUpperCase());
        for(Pays val : paysSet){
            System.out.println(val.getNom() + ", " + val.getHab() + ", " + val.getPibHab());
        }

    }
}
