package Arrays.level0;

import java.util.HashMap;

public class TwoSum {

    public static int[] two(int arr[], int target){
        HashMap<Integer, Integer> mpp = new HashMap<>();

        // return array of indices
        for(int i = 0; i < arr.length; i++){
            int complement = target - arr[i];

            if(mpp.containsKey(complement)){
                return new int[]{mpp.get(complement), i};
            }

            mpp.put(arr[i], i);
        }

        return new int[]{-1, -1}; // if no pair found
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        int target = 5;

        int result[] = two(arr, target);

        System.out.println(result[0] + " " + result[1]);
    }
}
