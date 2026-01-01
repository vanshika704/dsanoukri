package Arrays.day2;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,2,1,2,2};

        Arrays.sort(arr); // IMPORTANT

        int newLength = removeDuplicates(arr);

        // Print unique elements
        for(int i = 0; i < newLength; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static int removeDuplicates(int arr[]) {
        int writePos = 1;

        for(int readPos = 1; readPos < arr.length; readPos++){
            if(arr[readPos] != arr[readPos - 1]){
                arr[writePos] = arr[readPos];
                writePos++;
            }
        }
        return writePos;
    }
}
