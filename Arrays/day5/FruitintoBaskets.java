package Arrays.day5;

import java.util.HashMap;

public class FruitintoBaskets {
    public static void main(String[] args) {
        int fruits[] = new int[]{1, 2, 3, 2, 2};

        int left = 0, max = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int right = 0; right < fruits.length; right++) {
            mpp.put(fruits[right], mpp.getOrDefault(fruits[right], 0) + 1);

            while (mpp.size() > 2) {
                mpp.put(fruits[left], mpp.get(fruits[left]) - 1);
                if (mpp.get(fruits[left]) == 0)
                    mpp.remove(fruits[left]);
                left++;
            }

            max = Math.max(max, right - left + 1);
        }

        System.out.println(max); // OUTPUT: 4
    }
}
