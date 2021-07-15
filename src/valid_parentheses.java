import java.util.Stack;

public class valid_parentheses {
    public static void main(String[] args) {
        System.out.println(validParentheses("([}}])"));
    }

    static boolean validParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        if (s.length() % 2 != 0) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                continue;
            }
            if (stack.isEmpty()){
                return false;
            } else {
                if (s.charAt(i) == ')' && stack.peek() == '(' && !stack.isEmpty()) {
                    stack.pop();
                } else if (s.charAt(i) == ']' && stack.peek() == '[' && !stack.isEmpty()) {
                    stack.pop();
                } else if (s.charAt(i) == '}' && stack.peek() == '{' && !stack.isEmpty()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
