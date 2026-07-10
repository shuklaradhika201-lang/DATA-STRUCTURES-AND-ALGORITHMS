public class pattern5 {
    public static void main(String[] args) {
        subseq(" ", "abc");
        sub(" " , "abc");
    }

    //print all the subsequence of the string
    static void subseq(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch , up.substring(1));
        subseq(p , up.substring(1));
    }

    //print ascii value of the character
    static void sub(String p , String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        sub(p+ch , up.substring(1));
        sub(p,up.substring(1));
        sub(p + (ch+0) , up.substring(1));
    }
}
