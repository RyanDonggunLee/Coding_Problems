public class UniquePaths {
    public static int uniquePaths_BF(int m, int n) {
        int ans = 0;
        if(m != 0 && n != 0) {
            uniquePaths_BF(m - 1, n);
            uniquePaths_BF(m, n - 1);
        }
        else if (m == 0 && n == 0) {
            System.out.println("hit");
        }
        else if (m == 0)
            uniquePaths_BF(m, n-1);
        else if (n == 0)
            uniquePaths_BF(m-1, n);
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("answer " + uniquePaths_BF(6,2));
    }
}
