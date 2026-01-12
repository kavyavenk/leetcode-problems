import java.util.HashMap;
import java.util.Map;

public class longest_repeating_char_replacement {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int res = 0;
        int l = 0, maxf = 0;
        for (int r = 0; r < s.length(); r++) {
            int curr_count = map.getOrDefault(s.charAt(r), 0);
            map.put(s.charAt(r), curr_count + 1);
            maxf = Math.max(maxf, map.get(s.charAt(r)));

            while ((r-l+1) - maxf > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;
    }
}

