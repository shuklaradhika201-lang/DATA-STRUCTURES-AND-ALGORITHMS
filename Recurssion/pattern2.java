import java.util.ArrayList;

public class pattern2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,4};
        int i=0;
        System.out.println(max(arr, i));
        System.out.println(min(arr , i));
        int target=4;
        System.out.println(search(arr, i, target));
        System.out.println(firstocc(arr, i, target));
        int j=arr.length-1;
        System.out.println(lastocc(arr, j, target));
        System.out.println(allindices(arr, i, target));
        reverse(arr, j);
        int start=0;
        int end=arr.length-1;
        rev(arr, start,end);
        System.out.println();
        System.out.println(palindrome(arr, start, end));
        System.out.println(sum(arr,i));
        System.out.println(product(arr,i));
        System.out.println(count(arr,i));
        System.out.println(count1(arr,i));
    }
    
    //find max in array
    static int max=0;
    static int max(int[] arr , int i){
        if(i==arr.length){
            return max;
        }
        if(arr[i]>max){
            max=arr[i];
        }
        return max(arr, i+1);
    }

    //find min in array
    static int min=Integer.MAX_VALUE;
    static int min(int[] arr,int i){
        if(i==arr.length){
            return min;
        }
        if(arr[i]<min){
            min=arr[i];
        }
        return min(arr, i+1);
    }

    //lineear search
    static int search(int[] arr , int i , int target){
        if(i==arr.length){
            return i;
        }
        if(arr[i]==target){
            return i;
        }
        return search(arr, i+1, target);
    }

    //find first occurence
    static int firstocc(int[] arr , int i , int target){
        if(i==arr.length){
            return i;
        }
        if(arr[i]==target){
            return i;
        }
        return firstocc(arr, i+1, target);
    }

    //last occurence
    static int lastocc(int[] arr , int j , int target){
        if(j==arr.length){
            return j;
        }
        if(arr[j]==target){
            return j;
        }
        return lastocc(arr, j, target);
    }

    //all indices of target
    static ArrayList<Integer> list = new ArrayList<>();
    static ArrayList<Integer> allindices(int[] arr , int i , int target){
        if(i==arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        ArrayList<Integer> ans=allindices(arr, i+1, target);

        return ans;
    }

    //print a reverse array
    static void reverse(int[] arr , int j){
        if(j<0){
            return;
        }
        System.out.print(arr[j] + " ");
        reverse(arr,j-1);
    }

    //reverse the array
    static void rev(int[] arr , int start , int end){
        if(start>end){
            return;
        }
        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        rev(arr, start+1, end-1);
    }

    //check palindromic
    static boolean palindrome(int[] arr , int start , int end){
        if(start>=end){
            return true;
        }
        if(arr[start]!=arr[end]){
            return false;
        }

        return palindrome(arr, start+1, end-1);
    }

    //sum of array
    static int sum=0;
    static int sum(int[] arr , int i){
        if(i==arr.length){
            return sum;
        }
        return arr[i]+sum(arr, i+1);
    }

    //product of array
    static int product=1;
    static int product(int[] arr , int i){
        if(i==arr.length){
            return product;
        }
        return arr[i]*product(arr, i+1);
    }

    //count even number
    static int count=0;
    static int count(int[] arr , int i){
        if(i==arr.length){
            return count;
        }
        if(arr[i]%2==0){
            count++;
        }
        return count(arr,i+1);
    }

    //count odd numberss
    static int count1=0;
    static int count1(int[] arr , int i){
        if(i==arr.length){
            return count1;
        }
        if(arr[i]%2!=0){
            count1++;
        }
        return count1(arr,i+1);
    }
}
