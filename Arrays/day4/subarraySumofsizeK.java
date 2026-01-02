package Arrays.day4;

public class subarraySumofsizeK {
    public static int brute(int arr[], int k) {
    int n = arr.length;
    int maxSum = Integer.MIN_VALUE;

    for (int i = 0; i <= n - k; i++) {
        int sum = 0;
        for (int j = i; j < i + k; j++) {
            sum += arr[j];
        }
        maxSum = Math.max(maxSum, sum);
    }
    return maxSum;
}
public static int optimal (int arr[], int k){
int windowSum = 0 ;
for(int i = 0 ; i < k ; i++){
    windowSum +=arr[i];
  
}
int maxSum = windowSum ;
for(int i = k ; i < arr.length ; i++){
    windowSum +=arr[i]-arr[i-k];
    maxSum =  Math.max(maxSum , windowSum);
}
return maxSum;
}

    public static void main(String[] args) {
        int arr[] = new int[] {2,1,5,1,3,2};
        System.out.println(brute(arr, 3));
         System.out.println(optimal(arr, 3));
    }
}
