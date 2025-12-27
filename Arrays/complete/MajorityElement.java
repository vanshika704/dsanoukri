package Arrays.complete;

import java.util.HashMap;

public class MajorityElement {

    public static int brute(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int count = 0;

            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                return arr[i];
            }
        }
        return -1;
    }
public static int better(int arr[]){
    HashMap <Integer, Integer> mpp = new HashMap<>();
    for(int num:arr){
       mpp.put(num, mpp.getOrDefault(num, 0) + 1);
        if (mpp.get(num) > arr.length / 2) {
            return num;
        }
    }
    return -1;
}
public static int optimal(int arr[]){
    int count = 0 ;
    int candidate = -1 ;
    for(int num: arr){
        if(count ==0){
            candidate =num;
        }
        count+= (num == candidate) ? 1 :-1;
    }
    return candidate;
}
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,1,2,4};


        int ans = brute(arr);
        int ans1 = optimal(arr);
        System.out.println("Majority Element = " + ans);
         System.out.println("Majority Element = " + ans1);
    }
}
