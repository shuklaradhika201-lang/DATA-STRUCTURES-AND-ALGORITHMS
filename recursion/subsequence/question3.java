//Print subsequences of length K
package recursion.subsequence;

import java.util.*;

public class question3 {
    public static void main(String[] args) {
        String s="abc";
        List<String> add=new ArrayList<>();
        List<List<String>> result=new ArrayList<>();

        subsequence(s, 0, 0, add, result);
        System.out.println(result);

        oflenk(result, 2);
    }

    public static void oflenk(List<List<String>> result, int k){
        for(int i=0;i<result.size();i++){
            // System.out.print(result.get(i).size() + " ");

            if(result.get(i).size()==k){
                System.out.print(result.get(i) + " ");
            }
        }
    }

    public static void subsequence(String s , int i ,  int K , List<String> add , List<List<String>> result){
        if(i==s.length()){
            result.add(new ArrayList<>(add));
            return;
        }
        add.add(String.valueOf(s.charAt(i)));
        subsequence(s, i+1, K, add, result);
        
        add.remove(add.size()-1);
        subsequence(s, i+1, K, add, result);
    }
}
