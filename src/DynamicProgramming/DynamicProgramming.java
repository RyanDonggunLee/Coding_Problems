package DynamicProgramming;

public class DynamicProgramming {
    public static int fib(int num) {
        if (num == 1 || num == 2)
            return 1;
        int result = fib(num - 2) + fib(num - 1);
        return result;
    }
    public static int fib_dp(int n) {
        Integer[] memo = new Integer[n];
        if (n == 1 || n == 2)
            return 1;
        if (memo[n-1] != null) {
            return memo[n - 1];
        }
        int result = fib_dp(n-2) + fib_dp(n-1);
        memo[n-1] = result;
        return result;
    }
    public static int buttom_up(int n) {
            int[] memo = new int[n];
            memo[0] = 1;
            memo[1] = 1;
            for (int i = 2; i < n; i++) {
                memo[i] = memo[i-2] + memo[i-1];
            }
            return memo[n-1];
    }
    public static void main (String args[]) {
        System.out.println(fib(9));
        System.out.println(fib_dp(9));
        System.out.println(buttom_up(9));
    }
}
