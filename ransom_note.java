// 383. Ransom Note
// Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
// Each letter in magazine can only be used once in ransomNote.

// Example 1:
// Input: ransomNote = "a", magazine = "b"
// Output: false

// Example 2:
// Input: ransomNote = "aa", magazine = "ab"
// Output: false

// Example 3:
// Input: ransomNote = "aa", magazine = "aab"
// Output: true

class ransom_note {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] counter = new int[128];
        for (char ch : magazine.toCharArray()) {
            ++counter[ch];
        }
        // for (int i = 0; i < magazine.length(); i++) {
        //     arr[magazine.charAt(i) - 'a']++;
        // }
        for (char ch : ransomNote.toCharArray()) {
            if (--counter[ch] < 0)
                return false;
        }
        // for (int i = 0; i < ransomNote.length(); i++) {
        //     if (--arr[ransomNote.charAt(i) - 'a'] < 0) {
        //         return false;
        //     }
        // }
        return true;
    }
}