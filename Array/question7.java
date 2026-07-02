package Array;

import java.util.ArrayList;
import java.util.List;

public class question7 {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,5,7};
        List<String> list=new ArrayList<>();
        int i=0;
        while(i<arr.length){
            int start=arr[i];
            while(i+1<arr.length && arr[i+1]==arr[i]+1){
                i++;
            }
            int end=arr[i];
            if(start==end){
                list.add(String.valueOf(start));
            }
            else{
                list.add(start + "->" + end);
            }
            i++;
        }
        System.out.println(list);
    }
}
