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
        System.out.println(reverse(1234 ));
        System.out.println(sum1(123));
        System.out.println(count(1234));
        System.out.println(product(1234));
        System.out.println(max(1234));
        System.out.println(min(1234));
        System.out.println(count1(12223334 , 2));
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
    static  int rev=0;
    public static int reverse(int n){
        if(n==0){
            return rev;
        }
        int digit=n%10;
        rev=rev*10 + digit;
        return reverse(n/10);
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

    //max in the number
    static int max=Integer.MIN_VALUE;
    public static int max(int n){
        if(n==0){
            return max;
        }
        int digit=n%10;
        if(digit>max){
            max=digit;
        }

        return max(n/10);
    }

    //min in the number
    static int min=Integer.MAX_VALUE;
    public static int min(int n){
        if(n==0){
            return min;
        }
        int digit=n%10;
        if(digit<min){
            min=digit;
        }

        return min(n/10);
    }

    //occurence of a given digit in a number
    static int count1=0;
    public static int count1(int n , int key){
        if(n==0){
            return count1;
        }
        int digit=n%10;
        if(digit==key){
            count1++;
        }

        return count1(n/10, key);
    }
}
