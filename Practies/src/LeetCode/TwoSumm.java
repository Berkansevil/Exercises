package LeetCode;

public class TwoSumm {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            int current = nums[left] + nums[right];
            if (current < target) {
                left += 1;
            } else if (current > target) {
                right -= 1;
            } else {

                return new int[]{nums[left], nums[right]};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 18;
        twoSum(nums, target);
    }
}
