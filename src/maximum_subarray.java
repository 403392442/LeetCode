public class maximum_subarray {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }
    static int maxSubArray(int[] nums) {
        int current = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            current += nums[i];
            if (max<current) {
                max = current;
            }
            if (current < 0) {
                current = 0;
            }
        }
        return max;
    }
}
