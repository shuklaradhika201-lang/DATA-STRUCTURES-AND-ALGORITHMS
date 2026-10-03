//Count the number of subsets whose sum is K.

package recursion.subset;

import java.util.*;

public class question6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,2};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> add=new ArrayList<>();
        List<Integer> sums=new ArrayList<>();

        subset(arr, 0, 0, result, add, sums);
        count(0, 6, sums, result);
    }

    public static void count(int count , int k ,List<Integer> sums , List<List<Integer>> result ){
        for(int i=0;i<sums.size();i++){
            if(sums.get(i)==k){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void subset(int[] arr,int i, int sum , List<List<Integer>> result ,List<Integer> add ,List<Integer> sums ){
        if(i==arr.length){
            result.add(new ArrayList<>(add));
            sums.add(sum);
            return;
        }

        add.add(arr[i]);
        subset(arr, i+1, sum+arr[i], result, add, sums);

        add.remove(add.size()-1);
        subset(arr, i+1, sum, result, add, sums);
    }
}
