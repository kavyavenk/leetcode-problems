class longest_substring:
    def lengthOfLongestSubstring(self, s: str) -> int:
        seen = set()
        left = 0
        res = 0
        for right in range(len(s)):
            while s[right] in seen:
                seen.remove(s[left])
                left += 1
            seen.add(s[right])
            res = max(res, right - left + 1)
        return res