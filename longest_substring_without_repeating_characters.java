// used HashSet, O(n) approach
import java.util.HashSet;
import java.util.Set;

public class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        char ch;
        Set<Character> dict = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        for (int right = 0; right < s.length(); right++) {
            ch = s.charAt(right);
            if (!dict.contains(ch)) {
                dict.add(ch);
                maxLength = Math.max(maxLength, right-left+1);
            } else {
                while (s.charAt(left) != s.charAt(right)) {
                    dict.remove(s.charAt(left));
                    left++;
                }
                dict.remove(s.charAt(left));
                left++;
                dict.add(ch);
            }
        }
        return maxLength;
    }
}
