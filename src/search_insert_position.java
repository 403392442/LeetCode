public class search_insert_position {
    public static void main(String[] args) {
        int[] nums = new int[] {1};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }
    static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target || nums[i] > target) {
                return i;
            }
        }
        return nums.length;
    }
}
