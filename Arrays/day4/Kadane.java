package Arrays.day4;

public class Kadane {
    public static void main (String args[]){
        int arr[] = new int[] {2,3,-1,3,5,-2,4,5,6};
System.out.println(brute(arr));
System.out.println(optimal(arr));
    }
    public static int brute (int arr[]){ int n = arr.length; int maxSum = Integer.MIN_VALUE;
        for(int i =0 ; i < n ; i++){
int sum = 0 ;

for(int j = 0 ; j < n ; j++){
    sum+=arr[j];
maxSum = Math.max(sum,maxSum);
}
        }
        return maxSum;
    }
    public static int optimal(int arr[]){
      
        int sum = Integer.MIN_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for(int num:arr){
            sum = Math.max(sum+num , num);
            maxSum = Math.max(maxSum , sum);
        }
        return maxSum;
    }
}
