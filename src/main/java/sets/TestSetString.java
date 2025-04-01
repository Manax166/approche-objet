package sets;

import java.util.Comparator;
import java.util.HashSet;

public class TestSetString {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<>();
        String[] tab = {"USA", "France", "Allemagne", "UK", "Italie", "Japon", "Chine", "Russie", "Inde"};
        for (String val : tab) {
            hs.add(val);
        }
        System.out.println(hs);
        String pays = hs.stream().max(Comparator.comparingInt(String::length)).get();
        System.out.println(pays);
        hs.remove(pays);
        System.out.println(hs);

    }
}
