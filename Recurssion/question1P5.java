public class question1P5 {
    public static void main(String[] args) {
        // subseq("", "abcd");
        // System.out.println("number of subsequences are : " + count);
        // sub("", "abc");
        // int k=2;
        // subk("", "abc", k);
        // starta("", "abcd");
        // palindromic("", "aba");
        // subcheck("", "abcde");
        check("","abe");
    }

    static int count=0;
    static void subseq(String p, String up ){
        if(up.isEmpty()){
            System.out.println(p);
            count++;
            return;
        }
        char ch=up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static void sub(String p , String up){
        if(up.isEmpty()){
            if(!p.isEmpty()){
                System.out.println(p);
            }
            return;
        }
        char ch=up.charAt(0);
        sub(p+ch, up.substring(1));
        sub(p, up.substring(1));
    }

    //print subsequences of length k
    static void subk(String p , String up , int k){
        if(up.isEmpty()){
            if(p.length()==k){
                System.out.println(p);
            }
            return;
        }
        char ch=up.charAt(0);
        subk(p+ch , up.substring(1),k);
        subk(p , up.substring(1),k);
    }

    static void starta(String p ,String up){
        if(up.isEmpty()){
            if(p.startsWith("a")){
                System.out.println(p);
            }
            return;
        }
        char ch=up.charAt(0);
        starta(p+ch, up.substring(1));
        starta(p, up.substring(1));
    }

    //print all palindromic strings
    static void palindromic(String p , String up){
        boolean ispalindromic=true;
        if(up.isEmpty()){
            if(!p.isEmpty()){
                int i=0;
                int j=p.length()-1;
                while(i<j){
                    if(p.charAt(i)!=p.charAt(j)){
                        ispalindromic=false;
                        break;
                    }
                    i++;
                    j--;
                }
                if(ispalindromic){
                    System.out.println(p);
                }
            }
            return;
        }
        char ch=up.charAt(0);
        palindromic(p+ch, up.substring(1));
        palindromic(p, up.substring(1));
    }

    //check if ace is a subsequence of abcde
    static void subcheck(String p , String up){
        if(up.isEmpty()){
            if(p.equals("ace")){
                System.out.println("ace is a subsequences of the string");
            }
            return;
        }
        char ch=up.charAt(0);
        subcheck(p+ch, up.substring(1));
        subcheck(p, up.substring(1));
    }

    //subsequences with exactly two vowels
    static int k=2;
    static void check(String p , String up){
        int count1=0;
        if(up.isEmpty()){
            if(!p.isEmpty()){
                for(int i=0;i<p.length();i++){
                    char ch=p.charAt(i);
                    if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                        count1++;
                    }
                }
            }
            if(count1==k){
                System.out.println(p);
            }
            return;
        }
        char ch=up.charAt(0);
        check(p+ch, up.substring(1));
        check(p,up.substring(1));
    }

    //
}
