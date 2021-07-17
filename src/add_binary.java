public class add_binary {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";
        System.out.println(addBinary(a, b));
    }
    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int sum;
        int lengthA = a.length()-1;
        int lengthB = b.length()-1;
        while (lengthA >= 0 || lengthB >= 0) {
            int x = 0;
            int y = 0;
            if (lengthA >= 0) {
                x = a.charAt(lengthA) - '0';
            }
            if (lengthB >= 0) {
                y = b.charAt(lengthB) - '0';
            }
            sum = x + y + carry;
            if (sum == 3) {
                sb.append(1);
                carry = 1;
            } else if (sum == 2) {
                sb.append(0);
                carry = 1;
            } else {
                sb.append(sum);
                carry = 0;
            }
            lengthA--;
            lengthB--;
        }
        if (carry == 1) {
            sb.append(1);
        }
        return sb.reverse().toString();
    }
}
