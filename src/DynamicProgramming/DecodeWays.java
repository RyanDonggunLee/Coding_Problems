package DynamicProgramming;

public class DecodeWays {
    public int numDecodings(String s) {
        int result = 1;
        String[] list = s.split("");
        int[] listToNum = new int[list.length];
        for (int i = 0; i < list.length; i++) {
            listToNum[i] = Integer.parseInt(list[i]);
        }

        if (list.length == 1)
            return result;

        int[] ans = new int[list.length];
        ans[list.length - 1] = 1;
        for (int i = list.length - 2; i > 0; i --) {
            if(list[i-1] != null && Integer.parseInt(list[i-1]+list[i]) <= 26) {

            }
        }
        return ans[list.length - 1];
    }
}
