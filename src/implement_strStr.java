public class implement_strStr {
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        System.out.println(strStr(haystack, needle));

//        System.out.println(haystack.indexOf(needle));
    }

    static int strStr(String haystack, String needle) {
        if (needle.length() == 0) {return 0;}
        for (int i = 0; i <= (haystack.length() - needle.length()); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                for (int j = 0; j < needle.length(); j++) {
                    if (haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    }
                    if (j == needle.length()-1) {
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
