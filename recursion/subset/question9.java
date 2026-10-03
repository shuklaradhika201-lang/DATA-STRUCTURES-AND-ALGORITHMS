//Combination Sum II — find combinations that add up to a target; each element can be used once and duplicates must be handled. elaborate the question only not the answer

// Rule 1: Each element can be used only once

// Rule 2: The array can contain duplicates

package recursion.subset;
import java.util.*;
public class question9 {
    public static void main(String[] args) {
        int[] arr={1, 1, 2, 5};
        int target=2;
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> add=new ArrayList<>();

        Combination(0, target, arr,0, result, add);
        System.out.println(result);
    }

    public static void Combination(int i , int target,int[] arr , int sum ,List<List<Integer>> result ,List<Integer> add ){
        if(i==arr.length){
            return;
        }

        int newsum=sum+arr[i];

        if(newsum>target){
            Combination(i+1 , target,arr,sum,result,add);
            return ;
        }

        if(newsum==target){
            add.add(arr[i]);
            result.add(new ArrayList(add));
            add.remove(add.size()-1);
            return;
        }

        if(newsum<target){
            add.add(arr[i]);
            Combination(i+1, target, arr, newsum, result, add);
            add.remove(add.size()-1);
            Combination(i+1, target, arr, sum, result, add);
        }
    }
}
