package Arrays.level0;

public class SecondLargest {
    
    public static int second(int[] arr){
        int max = Integer.MIN_VALUE;
        int secondmax = Integer.MIN_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                secondmax = max;
                max = arr[i];
            } 
            else if(arr[i] > secondmax && arr[i] != max){
                secondmax = arr[i];
            }
        }

        return secondmax;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        System.out.println(second(arr));
    }
}
