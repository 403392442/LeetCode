public class remove_duplicate_from_sorted_array {
    public static void main(String[] args) {
        int[] num = {1,1,2,2,3,3,4,5,6,7,8,8,9};
        System.out.println(removeDuplicate(num));
    }

    static int removeDuplicate(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[index+1] = nums[i];
                index++;
            }
        }
        return ++index;
    }
}
