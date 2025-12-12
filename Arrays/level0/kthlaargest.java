package Arrays.level0;

import java.util.PriorityQueue;

public class kthlaargest {

    public static int largest(int arr[], int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int num : arr){
            pq.add(num);
            if(pq.size() > k){
                pq.poll();
            }
        }

        return pq.peek();
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6};
        int k = 4;

        System.out.println(largest(arr, k));
    }
}
