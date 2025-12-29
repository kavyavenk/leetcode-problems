// Given a string s, return true if it is a palindrome, otherwise return false.
// A palindrome is a string that reads the same forward and backward. It is also case-insensitive and ignores all non-alphanumeric characters.
// Note: Alphanumeric characters consist of letters (A-Z, a-z) and numbers (0-9).

// Example 1:
// Input: s = "Was it a car or a cat I saw?"
// Output: true
// Explanation: After considering only alphanumerical characters we have "wasitacaroracatisaw", which is a palindrome.

// Example 2:
// Input: s = "tab a cat"
// Output: false
// Explanation: "tabacat" is not a palindrome.

// Constraints:
// 1 <= s.length <= 1000
// s is made up of only printable ASCII characters.

// brute force - reverse + compare
class is_palindrome {
    public boolean isPalindrome(int x) {
        int rev=0;
        int temp=x;
        int dig=0;
        while(temp>0)
        {
            dig=temp%10;
            rev=dig+rev*10;
            temp=temp/10;
        }
        if(rev==x)
            return true;
        else
            return false;
    }
}

// improved - two pointers
class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        s = s.toLowerCase();
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (start < end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

