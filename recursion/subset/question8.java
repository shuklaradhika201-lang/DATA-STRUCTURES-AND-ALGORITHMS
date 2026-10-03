//Combination Sum — find combinations that add up to a target; an element can be reused.

package recursion.subset;
import java.util.*;

public class question8 {
    public static void main(String[] args) {
        int[] arr={1,5,3};
        int target=8;

        List<Integer> add=new ArrayList<>();
        List<Integer> sums=new ArrayList<>();
        List<List<Integer>> result=new ArrayList<>();

        subset(arr, 0, 0, add, result, target, sums);
        System.out.println(result);
    }

    public static void subset(int[] arr ,int i,int sum , List<Integer> add ,List<List<Integer>> result , int target , List<Integer> sums ){
        if(i==arr.length){
            return ;
        }

        int newsum=sum+arr[i];

        if(newsum>target){
            subset(arr, i + 1, sum, add, result, target, sums);
            return;
        }
        if(newsum==target){
            add.add(arr[i]);
            result.add(new ArrayList(add));
            add.remove(add.size() - 1);
            return ;
        }
        if(newsum<target){
            add.add(arr[i]);
            subset(arr, i, newsum, add, result, target, sums);

            add.remove(add.size()-1);
            subset(arr, i+1, sum, add, result, target, sums);
        }
    }
}
