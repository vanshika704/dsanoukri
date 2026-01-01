package Arrays.day2;

public class SecondLargest {
    public static void main (String args[]){
        int arr[] = new int [] {1,2,3,4,5,6};
       
        System.out.println( Secondlargest(arr));
    }
    public static int Secondlargest(int arr[]){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]> max){
                second = max ;
                max = arr[i];
            }
            else if (arr[i]<max && arr[i]>second){
                second = arr[i];
            }
        }
return second;
    }
}
