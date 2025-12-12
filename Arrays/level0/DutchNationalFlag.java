package Arrays.level0;

public class DutchNationalFlag {

    public static void sort012(int arr[]) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        while (mid <= high) {
            if (arr[mid] == 0) {
                // swap arr[low] & arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;
                low++;
                mid++;
            } 
            else if (arr[mid] == 1) {
                mid++;
            } 
            else { // arr[mid] == 2
                // swap arr[mid] & arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1,1,0,0,2,2,0,0,1,1};

        sort012(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
