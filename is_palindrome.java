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
