package LeetCode;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int [] numbers={0,0,1,1,2,2,3,4,4};
        RemoveDuplicates removeDuplicates=new RemoveDuplicates();
        removeDuplicates.removeDuplicates(numbers);
    }

    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
}
