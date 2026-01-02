package Arrays.day5;

import java.util.HashSet;

public class LongestSubstring {
    public static int brute (String s){
        int n = s.length();
        int maxLen = 0 ;
         for (int i = 0 ; i < n ; i++){
            boolean[] seen = new boolean[256];
            for(int j = i ; j< n ;j++){
                if(seen[s.charAt(j)])break;
                seen[s.charAt(j)] =  true;
                maxLen = Math.max(maxLen, j-i+1);
            }
         }
         return maxLen;
    }
    public static int optimal (String s ){
        int left  = 0 ; int maxLen = 0 ;
        HashSet <Character>  set = new HashSet<>();

        for(int right  = 0  ; right < s.length();  right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left++));
            }
             set.add(s.charAt(right));
        maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        System.out.println(brute(null));
    }
}
