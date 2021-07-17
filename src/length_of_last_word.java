public class length_of_last_word {
    public static void main(String[] args) {
        String s = " ";
        System.out.println(lengthOfLastWord(s));
    }
    static int lengthOfLastWord(String s) {
        String[] words = s.split(" ");
        if (words.length == 0) {
            return 0;
        }
        return words[words.length-1].length();
    }
}
