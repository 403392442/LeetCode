import java.util.Stack;

public class plus_one {
    public static void main(String[] args) {
        int[] digits = {8, 9, 9, 9};
        int[] result = plusOne(digits);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    static int[] plusOne(int[] digits) {
        int carry;
        int[] result;
        Stack<Integer> stack = new Stack<>();

        digits[digits.length-1] += 1;
        if (digits[digits.length-1] < 10) {
            return digits;
        } else {
            digits[digits.length-1] = 0;
            carry = 1;
            stack.push(digits[digits.length-1]);
            for (int i = digits.length-2; i >=0 ; i--) {
                digits[i] = digits[i] + carry;
                carry = 0;
                if (digits[i] == 10) {
                    digits[i] = 0;
                    carry++;
                }
                stack.push(digits[i]);
            }
            result = new int[digits.length + carry];
            result[0] = carry == 1 ? 1 : stack.pop();
            for (int i = 1; i < result.length; i++) {
                result[i] = stack.pop();
            }
        }
        return result;
    }
}
