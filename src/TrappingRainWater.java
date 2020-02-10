public class TrappingRainWater {
    public static int trap(int[] height) {
        int max = 0;
        int max_index = 0;
        int pointer = 0;
        int lans = 0;
        int rans = 0;
        for (int i = 0; i < height.length; i++) {
            if (max < height[i]) {
                max = height[i];
                max_index = i;
            }
        }
        for (int i = 0; i < max_index; i++) {
            if (pointer <= height[i]) {
                pointer = height[i];
            } else if (pointer > height[i]) {
                lans += pointer - height[i];
            } else {
                System.out.println("Something wrong");
            }
        }
        pointer = 0;
        for (int i = height.length - 1; i > max_index; i--) {
            if (pointer <= height[i]) {
                pointer = height[i];
            } else if (pointer > height[i]) {
                rans += pointer - height[i];
            } else {
                System.out.println("Something wrong");
            }
        }
        return lans + rans;
//        int[] water = new int[height.length];
//        int max = 0;
//        int result = 0;
//        int cur = 0;
//        int count = 0;
//        for(int i = 0; i < height.length; i++) {
//            if(height[i] > max) {
//                max = height[i];
//            }
//        }
//        for(int i = 0; i < height.length; i++) {
//            if(cur == 0 && height[i] > 0) {
//                cur = height[i];
//            } else if (cur != max && height[i] <= cur) {
//                water[i] = cur - height[i];
//            } else if (cur != max && height[i] > cur) {
//                cur = height[i];
//            } else if (height[i] == max && i+1 < height.length) {
//                cur = height[i+1];
//                count += 1;
//            }
//
//        }
//        return result;
    }
    public static void main(String args[]) {
        int[] example = new int[] {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trap(example));
    }
}
