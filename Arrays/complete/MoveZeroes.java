package Arrays.complete;

public class MoveZeroes {

    public static void brute(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int index = 0;

        // copy non-zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                temp[index++] = arr[i];
            }
        }

        // copy back to original array
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
public static void better(int arr[]){
    int n = arr.length;
    int writeIndex = 0;
    for(int i =0 ; i < n ;i++){
        if(arr[i] != 0){
            arr[writeIndex++] = arr[i];
        }
    }
    while(writeIndex < n){
        arr[writeIndex++] = 0;
    }
}
public static void optimal(int arr[]){
    int writePos = 0 ; 
    for(int readPos = 0 ; readPos < arr.length ; readPos++){
        if(arr[readPos] != 0){
            int temp = arr[writePos];
            arr[writePos] = arr[readPos];
            arr[readPos] = temp;
            writePos++;
        }
    }

}
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        brute(arr);
         for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
better(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
        optimal(arr);
          for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
