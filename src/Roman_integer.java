import java.util.HashMap;
import java.util.Map;

public class Roman_integer {
    public static void main(String[] args) {
        System.out.println(roman_to_integer("V"));
    }

    static int roman_to_integer(String s) {
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        for (int i = 0; i < s.length()-1; i++) {
            if (map.get(s.charAt(i)) < map.get(s.charAt(i+1))){
                result -= map.get(s.charAt(i));
            } else {
                result += map.get(s.charAt(i));
            }
        }
        result += map.get(s.charAt(s.length()-1));
        return result;
    }
}
