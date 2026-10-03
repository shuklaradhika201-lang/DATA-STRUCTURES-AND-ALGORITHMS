//Generate all unique subsets when the array contains duplicates

package recursion.subset;
import java.util.*;
public class question7 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,3};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> add=new ArrayList<>();

        HashSet<List<Integer>> set=new HashSet<>();

        subset(arr, 0, result, add, set);
        // System.out.println(result);
        System.out.println(set);
    }

    public static void subset(int[] arr , int i , List<List<Integer>> result , List<Integer> add , HashSet<List<Integer>> set ){
        if(i==arr.length){
            // result.add(new ArrayList(add));
            set.add(new ArrayList(add));
            return;
        }

        add.add(arr[i]);
        subset(arr, i+1, result, add, set);

        add.remove(add.size()-1);
        subset(arr,i+1,result,add,set);
    }
}
