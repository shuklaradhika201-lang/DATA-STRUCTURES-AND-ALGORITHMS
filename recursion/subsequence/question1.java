//Print all subsequences of a string

package recursion.subsequence;
public class question1 {
    public static void main(String[] args) {
        String a="abc";
        sub(a, "", 0);
    }

    public static void sub(String s , String current ,int i){
        if(i==s.length()){
            System.out.print("\"" + current + "\"");
            return;
        }
        sub(s, current + s.charAt(i), i+1);
        sub(s, current, i+1);
    }
}
