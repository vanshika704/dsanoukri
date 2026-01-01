package Arrays.day1;

public class reversearray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            // swap
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}
