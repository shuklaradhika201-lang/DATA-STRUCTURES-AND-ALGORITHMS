public class pattern3 {
    public static void main(String[] args) {
        System.out.println(skip("abbabchaa"));
        System.out.println(apple("abacappleabacd"));
        System.out.println(app("dsfappkkjj"));
        System.out.println(app("sssapplesss"));
    }

    //remove all a's from the string
    static String skip(String up){
        if(up.isEmpty()){
            return " ";
        }

        char ch=up.charAt(0);
        if(ch=='a'){
            return skip(up.substring(1));
        }
        else{
            return ch+skip(up.substring(1));
        }
    }

    //remove appli from the string
    static String apple(String up){
        if(up.isEmpty()){
            return " ";
        }

        char ch=up.charAt(0);
        if(up.startsWith("apple")){
            return apple(up.substring(5));
        }
        else{
            return ch + apple(up.substring(1));
        }
    }

    //remove app if there is no apple in the string
    static String app(String up){
        if(up.isEmpty()){
            return " ";
        }

        char ch=up.charAt(0);
        if(up.startsWith("app" ) && !up.startsWith("apple")){
            return app(up.substring(3));
        }
        else{
            return ch + app(up.substring(1));
        }
    }
}
