class valid_palindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String conc = "";
        String rev = "";
        // removing extra chars
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(((ch>=65&&ch<=90)||(ch>=97&&ch<=122)||(ch>=48&&ch<=57))) {
                conc += ch;
            }
        }
        System.out.println(conc);
        s = conc;
        // check palindrome
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
        return conc.equals(rev);
    }
}