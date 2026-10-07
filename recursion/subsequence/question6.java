//Print subsequences containing exactly K vowels

package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class question6 {
    public static void main(String[] args) {
        String a="abc";
        List<List<String>> result=new ArrayList<>();
        List<String> add=new ArrayList<>();
    }

    // public static void contain(List<List<String>> result , int k){
    //     for(int i=0;i<result.size();i++){
    //         if(result.get(i).contains()){

    //         }
    //     }
    // }

    public static void sub(int i , String a ,List<List<String>> result,List<String> add ){
        if(i==a.length()){
            result.add(new ArrayList<>(add));
            return;
        }

        add.add(String.valueOf(s.charAt(i)));
        sub(i+1, a, result, add);

        add.remove(add.size()-1);
        sub(i+1, a, result, add);
    }
}
