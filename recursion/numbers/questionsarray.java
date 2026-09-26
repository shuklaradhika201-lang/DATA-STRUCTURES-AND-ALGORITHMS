package recursion.numbers;

public class questionsarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 , 3};
        print(arr, 0);
        System.out.println();
        printr(arr, arr.length - 1);
        System.out.println();
        System.out.println(sum(arr, 0));
        System.out.println(max(arr, 0));
        System.out.println(sorted(arr, 0));
        System.out.println(search(arr,0,3));
        System.out.println(first(arr, 0,2));
        int j=arr.length-1;
        System.out.println(last(arr, j, 3));
        System.out.println(count2(arr,0,3));
        all(arr, 0, 3);
    }

    // print array
    public static void print(int[] arr, int i) {
        if (i == arr.length) {
            return;
        }
        System.out.print(arr[i] + " ");
        print(arr, i + 1);
    }

    // print array in reverse
    public static void printr(int[] arr, int i) {
        if (i < 0) {
            return;
        }
        System.out.print(arr[i] + " ");
        printr(arr, i - 1);
    }

    // sum of all elements
    static int sum = 0;

    public static int sum(int[] arr, int i) {
        if (i == arr.length) {
            return sum;
        }
        sum += arr[i];
        return sum(arr, i + 1);
    }

    // max element in the array
    static int max = Integer.MIN_VALUE;

    public static int max(int[] arr, int i) {
        if (i == arr.length) {
            return max;
        }
        if (arr[i] > max) {
            max = arr[i];
        }
        return max(arr, i + 1);
    }

    // min element in the array
    static int min = Integer.MIN_VALUE;

    public static int min(int[] arr, int i) {
        if (i == arr.length) {
            return min;
        }
        if (arr[i] < min) {
            min = arr[i];
        }
        return min(arr, i + 1);
    }

    // check if array is sorted
    public static boolean sorted(int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return sorted(arr, i + 1);
    }

    //linear search
    public static int search(int[] arr , int i , int key){
        if(i==arr.length){
            return search(arr, i , key);
        }
        if(arr[i]==key){
            return i;
        }

        return search(arr, i+1, key);
    }

    //first occurence
    public static int first(int[] arr , int i , int key){
        if(i==arr.length){
            return first(arr, i, key);
        }

        if(arr[i]==key){
            return i;
        }
        return first(arr, i+1, key);
    }

    //last occurence
    public static int last(int[] arr , int i , int key){
        if(i==0){
            return last(arr,i,key);
        }
        if(arr[i]==key){
            return i;
        }
        return last(arr, i-1, key);
    }

    //count occurence of elements 
    static int count2=0;
    public static int count2(int[] arr , int i , int key ){
        if(i==arr.length){
            return count2;
        }
        if(arr[i]==key){
            count2++;
        }
        return count2(arr, i+1, key);
    }

    //all occurence of an element
    public static void all(int[] arr , int i, int key){
        if(i==arr.length){
            return;
        }
        if(arr[i]==key){
            System.out.print(i + " ");
        }
        all(arr, i+1, key);
    }

    //reverse an array
    public static void reverse(int[] arr , int i , int key){
        
    }
}
