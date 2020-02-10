import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
//    public static int[] twoSum(int[] numbers, int target) {
//        for(int i = 0; i < numbers.length; i++){
//            for(int j = i + 1; j < numbers.length; j++) {
//                if(numbers[i]+numbers[j] == target) {
//                    int answer[] = new int[2];
//                    answer[0] = i;
//                    answer[1] = j;
//                    return answer;
//                }
//            }
//        } return null;
//    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int cur = target - nums[i];
            if (map.containsKey(cur) && map.get(cur) != i) {
                return new int[] {i, map.get(cur)};
            }
        } throw new IllegalArgumentException("no solution");
    }

    public static void main(String args[]) throws Exception {
        int[] ex = new int[] {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(ex, 9)));
        System.out.println("hello world");
    }


}
