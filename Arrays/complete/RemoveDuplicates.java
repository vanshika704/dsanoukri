package Arrays.complete;

public class RemoveDuplicates {

    public static int optimal(int[] arr) {
        int n = arr.length;
        if (n == 0) return 0;

        int j = 1; // index for unique elements

        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j - 1]) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j; // number of unique elements
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,2,3,4,5,6};

        int k = optimal(arr);

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
