package DailyChallenge.RecursionAndBacktracking.Theory.Recursion.SubSet;

import java.util.ArrayList;
import java.util.List;

public class SubSet {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        List<List<Integer>> ans = set(array);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
    }
    static List<List<Integer>> set(int[] array){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : array){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }
}
