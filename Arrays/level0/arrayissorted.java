package Arrays.level0;

public class arrayissorted {

    public static boolean isSorted(int arr[]) {int n = arr.length;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1] % n) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{ 4, 5, 1, 2, 3};

        System.out.println(isSorted(arr)); // true
    }
}
