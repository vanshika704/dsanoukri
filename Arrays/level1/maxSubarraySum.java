package Arrays.level1;

public class maxSubarraySum {
    public static int sum(int arr[]){
int currSum = 0;
int maxSum = arr[0];
for(int num: arr){
currSum +=num;
maxSum = Math.max(currSum, maxSum);
if(currSum<0) currSum = 0;
}
return maxSum;
    }

    public static int better(int arr[]){ int max = Integer.MIN_VALUE;
        for(int i = 0 ; i <arr.length ; i++){ int sum = 0 ; 
            for(int j = i ; j<arr.length ; j++){
sum +=arr[j];
max = Math.max(max,sum);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3,4,5,6,-2,-5};
        System.out.println(sum(arr));
        System.out.println(better(arr));
    }
}
