//Print subsequences containing a character

package recursion.subsequence;

import java.util.*;

public class question5 {
    public static void main(String[] args) {
        String s="abc";
        List<List<String>> result=new ArrayList<>();
        List<String> add=new ArrayList<>();
        List<String> contains=new ArrayList<>();

        sub(0, s, result, add);
        System.out.print(result + " ");

        System.out.println();
        charcater("a", result, contains);
        System.out.println(contains);
    }

    public static void charcater(String a, List<List<String>> result , List<String> contains){
        for(int i=0;i<result.size();i++){
            if(result.get(i).contains(a)){
                // contains.add(String.valueOf(result.get(i)));
                contains.add(result.get(i).toString());
            }
        }
    }

    public static void sub(int i , String s,List<List<String>> result,List<String> add){
        if(i==s.length()){
            result.add(new ArrayList<>(add));
            return;
        }

        add.add(String.valueOf(s.charAt(i)));
        sub(i+1, s, result, add);

        add.remove(add.size()-1);
        sub(i+1, s, result, add);
    }
}
