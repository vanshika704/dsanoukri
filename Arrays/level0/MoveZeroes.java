package Arrays.level0;

public class MoveZeroes {

    public static void zeroes(int arr[]) {
        int j = 0;

        // Step 1: Move all non-zero elements to front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 2: Fill the rest with zeroes
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 0, 4, 5, 0, 6};

        zeroes(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
