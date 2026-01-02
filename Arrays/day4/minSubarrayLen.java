package Arrays.day4;

public class minSubarrayLen {
    public static int optimal(int arr[], int target) {
        int left = 0;
        int sum = 0;
        int minLen = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            while (sum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                sum -= arr[left++];
            }
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }

    public static void main(String[] args) {
        int arr[] = new int[]{2, 3, 1, 2, 4, 3};
        System.out.println(optimal(arr, 7)); // Expected: 2
    }
}
