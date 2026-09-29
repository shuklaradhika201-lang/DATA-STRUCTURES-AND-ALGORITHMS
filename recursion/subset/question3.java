//Find the sum of every subset of an array.

package recursion.subset;

import java.util.*;

public class question3 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> add=new ArrayList<>();
        subset(arr,0,result,add , 0);
        System.out.println(result);
    }

    // static int sum=0;
    public static void subset(int[] arr , int i , List<List<Integer>> result , List<Integer> add , int sum){
        if(i==arr.length){
            result.add(new ArrayList<>(add));
            System.out.println(add + " = " + sum);
            return;
        }

        add.add(arr[i]);
        subset(arr, i+1, result, add , sum+arr[i]);


        add.remove(add.size()-1);
        subset(arr, i+1, result, add , sum);
    }
}
