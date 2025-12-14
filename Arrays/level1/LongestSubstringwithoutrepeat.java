package Arrays.level1;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwithoutrepeat {
    public static int LongestSubstring(String s ){
        Set <Character> set = new HashSet<>();
        int left = 0 ; int maxLen =  0 ;
        for(int right = 0 ; right < s.length(); right++){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen , right-left-1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String s = new String("abcabcbb");
System.out.println(LongestSubstring(s));
    }
}
