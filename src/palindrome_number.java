public class palindrome_number {
    public static void main(String[] args) {
        int num = 10;
        boolean result = isPalindrome(num);
        System.out.println(result);

    }

    static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }
        int reserved = 0;
        int number = x;
        while (x != 0) {
            reserved = reserved * 10 + x % 10;
            x /= 10;
        }
        return reserved == number;
    }
}
