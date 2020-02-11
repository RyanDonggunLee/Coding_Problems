package DynamicProgramming;

public class MaximumSubarray {
    public static int maxSubArray_BF(int[] nums) {
        int ans = nums[0];
        int sum = nums[0];
        for(int i = 0; i < nums.length; i++) {
            sum = nums[i];
            for(int j = i+1; j < nums.length; j++) {
                sum += nums[j];
                if(sum > ans)
                    ans = sum;
            }
        }
        return ans;
    }
    public static int maxSubArray(int[] nums) {
        return 0;
    }
    public static void main(String[] args) {
        int[] input = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("answer " + maxSubArray_BF(input));
        System.out.println("answer " + maxSubArray(input));
    }
}
