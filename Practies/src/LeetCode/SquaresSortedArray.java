package LeetCode;

import java.util.Arrays;

public class SquaresSortedArray {
     //    Input: nums = [-4,-1,0,3,10]
    //    Output: [0,1,9,16,100]
    //    Explanation: After squaring, the array becomes [16,1,0,9,100].
    //    After sorting, it becomes [0,1,9,16,100].

    public  static int[] sortedSquares(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i]= (int) Math.pow(nums[i],2);
        }
        Arrays.sort(nums);
     return nums;
    }

    public static void main(String[] args) {
        int [] nums={
                -4,-1,0,3,10
        };
        sortedSquares(nums);
    }

}
