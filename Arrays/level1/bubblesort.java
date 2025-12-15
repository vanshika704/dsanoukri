package Arrays.level1;

public class bubblesort {

    public static void bubble(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {          // passes
            for (int j = 0; j < n - i - 1; j++) {  // comparisons
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 2};

        bubble(arr);

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
