package LeetCode;

import java.util.Arrays;

public class SearchInsertPosition {

/*
Input: nums = [1,3,5,6], target = 8
Output: 5
 */

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6,8,10,12};
        System.out.println(searchInsert(nums, 13));
    }

    public static int searchInsert(int[] nums, int target) {
        int low=0;
        int last= nums.length-1;
        while (last>=low){
            int middle=low+(last-low)/2;
            if(target==middle){
                return middle;
            } else if (nums[middle]>target) {
                last=middle-1;
            }else {
                low=middle+1;
            }
        }
        return low;
    }
    }

