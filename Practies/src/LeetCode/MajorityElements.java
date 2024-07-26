package LeetCode;

public class MajorityElements {
    public static void main(String[] args) {
        int nums[]={2,2,1,1,1,2,2};
        int major= majorityElement(nums);
        for (int i = 0; i < major; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int majorityElement(int[] nums) {
        /*
        Input: nums = [2,2,1,1,1,2,2]
Output: 3
         */
        int size= nums.length;
        int majority=(nums.length)/2;
        int count=0;
        for (int i = 0 , j=0; i < nums.length; i++) {
            if (nums[i] == nums[j]) {
                count++;
            } else if (majority>count) {
                return majority;
            }
        }
        return majority;
    }
}
