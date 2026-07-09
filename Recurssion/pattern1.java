public class pattern1 {
    public static void main(String[] args) {
        numbers(1);
        System.out.println();
        number(5);
        System.out.println();
        System.out.println(sum(5));
        System.out.println(factorial(5));
        System.out.println(count(123456));
        System.out.println(sum1(123));
        System.out.println(product(1234));
        System.out.println(reverse(1234));
        palindrome(121);
    }

    //print numbers from1 to n
    static void numbers(int n){
        if(n==6){
            return;
        }
        System.out.print(n + " ");
        numbers(n+1);
    }

    //numbers from n to 1
    static void number(int n){
        if(n==0){
            return;
        }
        System.out.print(n + " ");
        number(n-1);
    }

    //sum of n numbers
    static int sum=0;
    static int sum(int n){
        if(n==0){
            return sum;
        }
        return n+sum(n-1);
    }

    //factorial of n numbers
    static int multi=1;
    static int factorial(int n){
        if(n==1){
            return multi;
        }
        return n*factorial(n-1);
    }

    //count of digits in a nubmer
    static int count=0;
    static int count(int n){
        if(n==0){
            return count;
        }
        count++;
        return count(n/10);
    }

    //sum of digits in  number
    static int sum1=0;
    static int sum1(int n){
        if(n==0){
            return sum1;
        }
        int digit=n%10;
        sum1+=digit;
        return sum1(n/10);
    }

    //product of digits
    static int product=1;
    static int product(int n){
        if(n==1){
            return product;
        }
        int digit=n%10;
        product*=digit;
        return product(n/10);
    }

    //reverse the number 
    static int rev=0;
    static int reverse(int n){
        if(n==0){
            return rev;
        }
        rev = rev * 10 + (n % 10);
        return reverse(n / 10);
    }

    //check palindrome
    static void palindrome(int n){
        rev=0;
        int ans=reverse(n);
        if(n==ans){
            System.out.println("number is palindrome");
        }
        else{
            System.out.println("number is not palindrome");
        }
    }

    //count zeroes in a number
    
} 