package Arrays.level1;

public class maxSubarrayofsizeK {

    /**
     * Finds the maximum sum of a contiguous subarray of size k using the Sliding Window technique.
     * * @param arr The input array of integers.
     * @param k The fixed size of the subarray.
     * @return The maximum sum found, or 0 if k is invalid or the array is empty.
     */
    public static int maxSubarrayOfSizeK(int[] arr, int k) {
        // --- 1. Edge Case Handling (CRITICAL FIX) ---
        if (arr == null || k <= 0 || k > arr.length) {
            // Return 0 or throw an IllegalArgumentException, 
            // depending on expected behavior for invalid input.
            // Returning 0 for this specific problem context is often acceptable.
            return 0; 
        }

        int currentWindowSum = 0;
        int max_sum = Integer.MIN_VALUE;

        // The Sliding Window approach
        for (int i = 0; i < arr.length; i++) {
            // 1. Add the current element to the window sum (Expand the window)
            currentWindowSum += arr[i];

            // 2. Once the window reaches size k (i.e., when i >= k-1)
            if (i >= k - 1) {
                // a. Check if the current window sum is the maximum
                max_sum = Math.max(max_sum, currentWindowSum);

                // b. Slide the window forward: subtract the element 
                //    that is now leaving the window from the left end
                currentWindowSum -= arr[i - k + 1]; 
            }
        }
        
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, -9, 2, 4, -9, 32, 2, 3, 4, 5};
        int k_valid = 3;
        int k_invalid = 0; // Example of invalid k

        // Example 1: Valid k=3 (Subarrays: [1,2,3]=6, [2,3,4]=9, [3,4,-9]=-2, ..., [4,5]=9)
        System.out.println("Max sum for k=" + k_valid + ": " + maxSubarrayOfSizeK(arr, k_valid)); // Expected: 32+2+3=37

        // Example 2: Invalid k=0 (This now returns 0 due to the edge case fix)
        System.out.println("Max sum for k=" + k_invalid + ": " + maxSubarrayOfSizeK(arr, k_invalid));
    }
}