package Arrays.level0;

public class RemoveDuplicates {

    public static int Remove(int arr[]) {
        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;  // length of array with unique elements
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 2, 3, 4, 5, 5};

        int newLength = Remove(arr);

        for (int k = 0; k < newLength; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
