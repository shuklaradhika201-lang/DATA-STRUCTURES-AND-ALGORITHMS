//Count the total number of subsets of an array.

package recursion.subset;

import java.util.*;

public class question2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> add = new ArrayList<>();
        subset(arr, 0, result, add);
        System.out.println(result);
        System.out.println(result.size());
    }

    public static void subset(int[] arr, int i, List<List<Integer>> result, List<Integer> add) {
        if (i == arr.length) {
            result.add(new ArrayList<>(add));
            return;
        }
        add.add(arr[i]);
        subset(arr, i + 1, result, add);
        add.remove(add.size() - 1);
        subset(arr, i + 1, result, add);
    }
}
