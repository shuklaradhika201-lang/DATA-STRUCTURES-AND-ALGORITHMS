//Print all subset whose sum is K.

package recursion.subset;

import java.util.*;

public class question5 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2 };
        List<Integer> add = new ArrayList<>();
        List<Integer> sums = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        subset(arr, 0, sums, add, result, 0);
        printset(6, sums, result);
    }

    public static void printset(int k, List<Integer> sums, List<List<Integer>> result) {
        int index = sums.indexOf(k);
        for (int i = 0; i < sums.size(); i++) {
            if (sums.get(i) == k) {
                System.out.println(result.get(i));
            }
        }
    }

    public static void subset(int[] arr, int i, List<Integer> sums, List<Integer> add, List<List<Integer>> result,
            int sum) {
        if (i == arr.length) {
            result.add(new ArrayList<>(add));
            sums.add(sum);
            return;
        }
        add.add(arr[i]);
        subset(arr, i + 1, sums, add, result, sum + arr[i]);

        add.remove(add.size() - 1);
        subset(arr, i + 1, sums, add, result, sum);
    }
}
