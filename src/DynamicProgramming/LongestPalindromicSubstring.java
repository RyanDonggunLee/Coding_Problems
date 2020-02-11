package DynamicProgramming;

public class LongestPalindromicSubstring {
    public static String longestPalindrome_BF(String s) {
        if (s == null || s == "" || s.length() > 1000) {
            return null;
        }
        int start, end;
        int length = s.length();
        String[] list = s.split("");
        start = 0;
        end = 0;
        int result = 0;

        for(int i = length - 1; i >= 0; i--) {
            for(int j = 0; j < i; j++) {
//                if(result > 0)
//                    break;
                int ans = findingPal_BF(list, j, i);
                if (ans > result) {
                    start = j;
                    end = i;
                    result = ans;
                }
            }

        }

//        int length = s.length();
//        int startcur = 0;
//        int start = 0;
//        int end = length;
//        int endcur = length;
//
//        String[] slist = s.split("");
//
//        while(end < start || end == start) {
//            if(start == end - 1) {
//                start = 0;
//                endcur =- 1;
//                end = endcur;
//            }
//            if(slist[start].equalsIgnoreCase(slist[end])) {
//
//                start =+ 1;
//                end =- 1;
//            }
//        }
//
//
//        String[] ans = new String[end-start];
//
        StringBuffer sb = new StringBuffer();

        for (int i = start; i <= end; i++) {
            sb.append(list[i]);
        }
        return sb.toString();
    }

    private static int findingPal_BF(String[] list, int start, int end) {
        int startp = start;
        int endp = end;
        int ans = 0;
        while(list[start].matches(list[end]) && start < end) {
            if(end - 1 == start) {
                ans = endp - startp;
            } else if(end - 1 == start + 1 ) {
                ans = endp - startp;
            }
            start ++;
            end --;
        }
        return ans;
    }

    private static String longestPalindrome(String s) {
        int start, result = 0;
        int end = s.length();
        String[] list = s.split("");

        return "";
    }

    public static void main(String args[]) {
        System.out.println(longestPalindrome_BF("abadd"));
    }
}
