//plus one
package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class question4 {
    public static void main(String[] args) {
        int[] arr={9};
        //convert array to num
        int num=0;
        for(int digit:arr){
            num=num*10+digit;
        }
        System.out.println(num);

        //add plus one to num
        num+=1;
        System.out.println(num);

        //convert num to array
        List<Integer> digits = new ArrayList<>();
        while(num>0){
            digits.add(num%10);
            num/=10;
        }
        Collections.reverse(digits);
        System.out.println(digits);
    }
}
