public class length_last_word {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        // s = s + " ";
        int wordlen = 0;
        for (int i = s.length()-1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                wordlen++;
            } else if (wordlen > 0) {
                break;
            }
        }
        return wordlen;
    }
}
