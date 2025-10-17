class is_palindrome:
    def isPalindrome(self, x: int) -> bool:
        if x < 0:
            return False
        rev = 0
        dig = 0
        dup = x
        while dup != 0:
            dig = dup % 10
            rev = rev * 10 + dig
            dup = dup // 10
        return rev == x
        