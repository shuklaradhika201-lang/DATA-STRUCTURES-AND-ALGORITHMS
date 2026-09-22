package recursion.numbers;

public class questions {
    public static void main(String[] args) {
        number(5);
        System.out.println();
        numbers(5);
        System.out.println();
        even(10);
        System.out.println();
        odd(10);
        System.out.println();
        System.out.println(sum(3));
        System.out.println(factorial(3));
        System.out.println(power(2,5));
        System.out.println(reverse(1234 , 0));
        System.out.println(sum1(123));
        System.out.println(count(1234));
        System.out.println(product(1234));
        System.out.println(palindromic(121));
    }

    // print numbers 1 to n
    public static void number(int n) {
        if (n == 0) {
            return;
        }
        number(n - 1);
        System.out.print(n + " ");
    }

    //print numbers from n to 1
    public static void numbers(int n) {
        if (n == 0) {
            return;
        }
        System.out.print(n + " ");
        numbers(n - 1);
    }

    //print even number between 1 to n
    public static void even(int n){
        if(n==0){
            return;
        }

        even(n-1);
        if(n%2==0){
            System.out.print(n + " ");
        }
    }

    //print odd numbers between 1 to n
    public static void odd(int n){
        if(n==0){
            return;
        }

        odd(n-1);
        if(n%2!=0){
            System.out.print(n + " ");
        }
    }

    //sum of first n numbers
    static int sum=0;
    public static int sum(int n){
        if(n==0){
            return sum;
        }
        sum+=n;
        return sum(n-1);
    }

    //factorial of n numbers
    static int factorial=1;
    public static int factorial(int n){
        if(n==1){
            return factorial;
        }
        factorial*=n;
        return factorial(n-1);
    }

    //find a^b
    static int power=1;
    public static int power(int a , int b){
        if(b==0){
            return power;
        }
        power*=a;
        return power(a,b-1);
    }

    //reverse a number
    public static int reverse(int n , int rev){
        if(n==0){
            return rev;
        }
        int digit=n%10;
        rev=rev*10 + digit;
        return reverse(n/10 , reverse);
    }

    //sum of digits in a number
    static int sum1=0;
    public static int sum1(int n){
        if(n==0){
            return sum1;
        }
        int digit=n%10;
        sum1+=digit;
        return sum1(n/10);
    }

    //count of digits in a number
    static int count=0;
    public static int count(int n){
        if(n==0){
            return count;
        }
        count++;
        return count(n/10);
    }

    //product of digits in a number
    static int product=1;
    public static int product(int n){
        if(n==0){
            return product;
        }
        int digit=n%10;
        product*=digit;
        return product(n/10);
    }

    //check number is palindromic
    static int reverse=0;
    public static boolean palindromic(int n){
        int reversed=reverse(n , 0);
        return n==reversed;
    }
}
