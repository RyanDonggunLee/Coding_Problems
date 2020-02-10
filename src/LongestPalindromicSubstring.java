public class LongestPalindromicSubstring {
    public static String longestPalindrome(String s) {
        int length = s.length();
        String[] slist = new String[length];
        slist = s.split("");

        int start = 0;
        int end = length;

        String[] ans = new String[end-start];

        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < ans.length; i++){
            sb.append(ans[i]);
        }
        return "";
    }
    public static void main(String args[]) {
        longestPalindrome("hellow guys");
    }
}
