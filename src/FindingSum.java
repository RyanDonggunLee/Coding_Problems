import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindingSum {
    public static List<List<Integer>> threeSum(int[] nums) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                List<Integer> ls = new ArrayList<>();
                int cur = -nums[i]-nums[j];
                if (hash.containsKey(cur) && hash.get(cur)!=i && hash.get(cur)!=j && hash.get(cur) > j) {
                    System.out.println("Cur : " + cur + " i : " + i + " j : " + j + " hash : " + hash.get(cur) + " hash loc : " + hash.containsKey(cur));
                    ls.add(nums[i]);
                    ls.add(nums[j]);
                    ls.add(nums[hash.get(cur)]);
                    ans.add(ls);
                }
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            for (int i = i + 1; )
        }
        return ans;
    }
    public static void main(String args[]) {
        int[] input = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(input));
    }
}
