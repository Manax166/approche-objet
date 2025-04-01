package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {
    public static void main(String args[]) {
        List<Integer> list = new ArrayList<>() ;
        int[] tab =  {-1,5,7,3,-2,4,8,5};
        for(int val : tab){
            list.add(val);
            System.out.println(val);
        }
        int max = list.stream().max(Integer::compare).get();
        int min = list.stream().min(Integer::compare).get();
        list.remove((Integer) (min));
        System.out.println(list.size());
        System.out.println(max);
        System.out.println(min);
    }

}
