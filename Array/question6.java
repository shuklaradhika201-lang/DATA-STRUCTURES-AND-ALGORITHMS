package Array;

import java.util.HashMap;

public class question6 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1};
        int n=arr.length;
        int k=3;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i] , 0)+1);
            if(map.containsKey(arr[i])){
                int previndex=map.get(arr[i]);
                if(i-previndex<=k){
                    System.out.println(true);
                    break;
                }
                else{
                    System.out.println(false);
                }
            }
            map.put(arr[i], i);
        }
    }
}
