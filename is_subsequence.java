class Solution {
    public boolean isSubsequence(String s, String t) {
        String check = "";
        // int count = 0;
        // for(int i = t.length()-1; i >= 0; i--) {
        //     String ch = t.charAt(i)+"";
        //     if(s.contains(ch) && count < s.length()) {
        //         check = ch + check;
        //         count++;
        //     }
        // }
        int si = s.length()-1, ti = t.length()-1;
        while(si>=0 && ti>=0) {
            if(s.charAt(si) == t.charAt(ti)) {
                check = s.charAt(si) + check;
                si--;
            }
            ti--;
        }
        System.out.print(check);
        return (check.equals(s));
    }
}