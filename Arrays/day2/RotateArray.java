package Arrays.day2;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int arr[] = new int []{1,2,3,4,5,6}; int k = 2;
        rotate(arr , k);
     System.out.println(Arrays.toString(arr));
    }
   public static void rotate (int arr[] , int k){
    reverse(arr,0,arr.length-1);
    reverse(arr , 0, k-1);
    reverse(arr, k , arr.length-1);
   } 
   public static void reverse (int arr[] , int left , int right){
    while(left <right){ int temp = arr[left];
    arr[left]= arr[right];
    arr[right]= temp;
    left++;right--;}
   
   }
}
