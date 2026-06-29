package Array;

import java.util.Arrays;

public class question2 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 4, 2};
        int n = arr.length;

        int pivot = -1;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) {
            reverse(arr, 0, n - 1);
        } else {
            int candidate = Integer.MAX_VALUE;
            int index = -1;

            for (int i = pivot + 1; i < n; i++) {
                if (arr[i] > arr[pivot] && arr[i] < candidate) {
                    candidate = arr[i];
                    index = i;
                }
            }

            int temp = arr[pivot];
            arr[pivot] = arr[index];
            arr[index] = temp;

            reverse(arr, pivot + 1, n - 1);
        }

        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}