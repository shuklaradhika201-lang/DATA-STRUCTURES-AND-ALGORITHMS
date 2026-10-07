//count all subsequence

package recursion.subsequence;

public class question2 {
    public static void main(String[] args) {
        String a="abcd";
        System.out.println(sub(a,0,"" ));
    }

    public static int sub(String a , int i , String current){
        if(i==a.length()){
            return 1;
        }
        int pick=sub(a, i+1, current + a.charAt(i));
        int notpick=sub(a, i+1, current);

        return pick+notpick;
    }
}
