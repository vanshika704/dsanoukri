package Arrays.level1;

import java.util.HashMap;
import java.util.Map;

public class LongestSubarraywithsumk {
    public static int positiveonly(int arr[], int k){
        int left =  0 , sum = 0 , maxLen = 0;
        for(int right = 0 ; right < arr.length ;  right++){
            sum+=arr[right];
            while(sum>k){
                sum -=arr[left++];

            }
            if(sum==k){
                maxLen = Math.max(maxLen , right-left+1);
            }
        }
        return maxLen;
    }
    public static int positivenegative(int arr[], int k){
        Map <Integer, Integer> map =  new HashMap<>();
        int sum = 0 , maxLen = 0 ;
        for(int i = 0 ; i< arr.length ; i++){
            sum+=arr[i];
            if(sum ==  k )maxLen = i+1 ;
            if(map.containsKey(sum-k)){
                maxLen = Math.max(maxLen , i -map.get(sum-k));
            }
            map.putIfAbsent(sum,i);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        
    }
}
