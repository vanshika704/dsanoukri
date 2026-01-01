package Arrays.day3;

public class bubblesort {
    public static void main(String[] args) {
        int arr[] =  new int []{1,2,53,5,4,3};
    int n = arr.length;

    for(int i = 0 ;i < n ; i++){
Boolean swapped = false;
        for(int j =  1;  j < n ;j++ ){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j]= arr[j-1];
                arr[j-1]= temp;
                swapped = true;
            }
        }
        if(!swapped )break;
    }
    for(int num : arr)
    System.out.print(num + "  ");
    }
    
    
}
