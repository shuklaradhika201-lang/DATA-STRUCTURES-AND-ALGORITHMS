//Check if a subset with sum K exists.

package recursion.subset;

import java.util.*;

public class question4 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> add=new ArrayList<>();
        List<Integer> sums=new ArrayList<>();
        subset(arr, 0, result, add, sums, 0);
        System.out.println(subsetexist(sums,6));
    }

    public static boolean subsetexist(List<Integer> sums , int k){
        if(sums.contains(k)){
            return true;
        }
        return false;
    }

    public static void subset(int[] arr ,int i , List<List<Integer>> result , List<Integer> add , List<Integer> sums , int sum){
        if(i==arr.length){
            result.add(new ArrayList<>(add));
            sums.add(sum);
            return;
        }

        add.add(arr[i]);
        subset(arr, i+1, result, add, sums, sum+arr[i]);

        add.remove(add.size()-1);
        subset(arr,i+1,result,add,sums,sum);
    }
}
