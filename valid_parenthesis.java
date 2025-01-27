// stack implementation - optimized - O(n) time O(n) space worst case i.e. all open brackets
import java.util.*;
public class valid_parenthesis {
    private boolean matching (char open, char close) {
        return ((open == '{' && close == '}') || (open == '[' && close == ']') || (open == '(' && close == ')'));
    }
    public boolean isvalid (String s) {
        Stack<Character> st = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
            }
        }
    }
}
