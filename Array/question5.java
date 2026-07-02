package Array;

import java.util.ArrayList;
import java.util.List;

public class question5 {
    public static void main(String[] args) {
        int n=5;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        for(int i=0;i<n;i++){
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = ans.get(ans.size() - 1);
            curr.add(1);
            for(int j=1;j<i;j++){
                curr.add(prev.get(j)+prev.get(j-1));
            }
            curr.add(1);
            ans.add(curr);
        }
        System.out.println(ans);
    }
}
