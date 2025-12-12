package Arrays.level0;

public class ReverseArray {
    public static void Reverse(int[] arr){
    
int left = 0 ; int right = arr.length-1;
      while(left<right){
        int temp = arr[left];
        arr[left ]= arr[right];
        arr[right]= temp;
        left++;right--;
      }
    }
public static void main(String[] args) {
  int arr[] = new int[]{1, 2, 3, 4, 5};
Reverse(arr);
for(int num:arr){
    System.out.print(num + " ");
}
}
    
}