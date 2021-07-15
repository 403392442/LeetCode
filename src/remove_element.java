public class remove_element {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 1, 2, 3, 3, 5, 3, 6};
        int val = 3;
        System.out.println(removeElement(nums, val));
    }
    static int removeElement(int[] nums, int val) {
        int index;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            index = i;
            while (index < nums.length && nums[index] == val) {
                index++;
            }
            if (i != index && index < nums.length) {
                nums[i] = nums[index];
                nums[index] = val;
                i--;
            }
            if (i == index){
                count++;
            }
        }
        return count;
    }
}
