//rearrange array elements by sign 

package Array;

import java.util.Arrays;

public class question1 {
    public static void main(String[] args) {
        int[] arr = { -1,1 };
        int n = arr.length;
        int[] ans = new int[n];
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                ans[k]=arr[i];
                k=k+2;
            }
        }
        k=1;
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                ans[k]=arr[i];
                k=k+2;
            }
        }
        System.out.println(Arrays.toString(ans));
    }
}
