package Arrays.day3;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {

        int arr[] = {1, 2, 53, 5, 4, 3};
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // shift elements greater than key
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            // place key at correct position
            arr[j + 1] = key;
        }

        System.out.println(Arrays.toString(arr));
    }
}
