public class longest_common_prefix {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"cir", "car"}));
    }

    static String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            if (prefix.equals("")) {
                break;
            }
            String str = strs[i];
            int count = 0;
            int len = Math.min(str.length(), prefix.length());
            for (int j = 0; j < len; j++) {
                if (prefix.charAt(j) == str.charAt(j)) {
                    count ++;
                } else {
                    break;
                }
            }
            prefix = prefix.substring(0, count);
        }
        return prefix;
    }
}
