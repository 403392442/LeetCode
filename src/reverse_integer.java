public class reverse_integer {
    public static void main(String[] args) {
        long num = 123;
        long result = reverseInteger(num);
        System.out.println(result);
    }

    static long reverseInteger(long num) {
        long number = 0;
        long rem;
        while (num != 0) {
            rem = num % 10;
            number = number * 10 + rem;
            num = num / 10;
        }
        if (number > Integer.MAX_VALUE || number < Integer.MIN_VALUE){
            number = 0;
        }
        return number;
    }
}
