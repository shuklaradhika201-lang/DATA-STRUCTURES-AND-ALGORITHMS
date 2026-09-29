//Generate all subsets of an array

package recursion.subset;

import java.util.ArrayList;
import java.util.List;

public class question1 {
    public static void main(String[] args) {
        int[] arr={1,2,3};
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> add=new ArrayList<>();
        subsets(arr, 0, result, add);
        System.out.println(result);
    }

    public static void subsets(int[] arr, int i, List<List<Integer>> result, List<Integer> add){
        if(i==arr.length){
            result.add(new ArrayList<>(add));
            return;
        }

        add.add(arr[i]);
        subsets(arr , i+1, result, add);

        add.remove(add.size()-1);
        
        subsets(arr, i+1, result, add);
    }
}
