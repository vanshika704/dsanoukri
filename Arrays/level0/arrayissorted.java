package Arrays.level0;

public class arrayissorted {

    public static boolean isSorted(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};

        System.out.println(isSorted(arr)); // true
    }
}
