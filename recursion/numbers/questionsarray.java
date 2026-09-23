package recursion.numbers;

public class questionsarray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        print(arr, 0);
        System.out.println();
        printr(arr, arr.length - 1);
        System.out.println();
        System.out.println(sum(arr, 0));
        System.out.println(max(arr, 0));
        System.out.println(sorted(arr, 0));
        System.out.println(search(arr,0,3));
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
}
