package Arrays.level1;

public class selectionsort {
    public static void select(int[]arr){
        int n = arr.length;
        for(int i = 0 ; i < n-1 ; i++){
            int minIndex= i ;
            for(int j = i+1 ; j<n ; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex]= arr[i];
            arr[i]=temp;
        }
    }

    public static void easy(int arr[]){
        for(int i = 0 ; i< arr.length-1 ; i++){
            for(int j =i+1 ; j<arr.length ; j++){
                if(arr[j]<arr[i]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            } 
        }
    }
    public static void main(String[] args) {
        int arr[] =  new int[]{1,3,4,2,5};
        select(arr);
for(int num:arr){
    System.out.println(num);

}

    }
    
}
