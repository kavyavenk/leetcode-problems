public class first_unique_char_in_string {
    public int firstUniqChar(String s) {
        int[] freq = new int[26]; // created a frequency table for all 26 letters
        // need to turn string to char array
        for (char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i)-'a'] == 1) {
                return i;
            }
        }
        return -1;

        // or use hashmap
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (char a : s.toCharArray()) {
        //     map.put(a, map.getOrDefault(a,0) + 1);
        // }
        // for (int i = 0; i < s.length(); i++) {
        //     if (map.get(s.charAt(i)) == 1) {
        //         return i;
        //     }
        // }
        // return -1;
    }
}
