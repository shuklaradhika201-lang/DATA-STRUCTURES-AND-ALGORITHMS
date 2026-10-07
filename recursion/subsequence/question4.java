//Count subsequences of length K

package recursion.subsequence;

import java.util.ArrayList;
import java.util.List;

public class question4 {
    public static void main(String[] args) {
        String s="abc";
        List<List<String>> result=new ArrayList<>();
        List<String> add=new ArrayList<>();

        sub(s, 0, result, add);
        System.out.println(count(result, 2, 0));

    }

    public static int count(List<List<String>> result,int k,int count){
        for(int i=0;i<result.size();i++){
            if(result.get(i).size()==k){
                count++;
            }
        }

        return count;
    }
    
    public static void sub(String s , int i , List<List<String>> result , List<String> add){
        if(i==s.length()){
            result.add(new ArrayList<>(add));
            return;
        }
        add.add(String.valueOf(s.charAt(i)));
        sub(s, i+1, result, add);

        add.remove(add.size()-1);
        sub(s, i+1, result, add);
    }
}
