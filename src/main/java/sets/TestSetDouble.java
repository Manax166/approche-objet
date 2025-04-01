package sets;

import java.util.HashSet;

public class TestSetDouble {
    public static void main(String args[]) {
        HashSet<Double> hs = new HashSet<>();
        double[] tab = {1.5, 8.25, -7.32, 13.3, -12.45, 48.5, 0.01};
        for(double val : tab){
            hs.add(val);
        }
        System.out.println(hs);
        System.out.println(hs.stream().max(Double::compare).get());
        System.out.println(hs.remove(hs.stream().min(Double::compare).get()));
        System.out.println(hs);
    }
}
