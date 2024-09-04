package LeetCode;

public class JumpGame {
    public  static boolean canJump(int[] nums) {

        for (int i = 1; i < nums.length ; i++) {
            if(nums[i]== nums.length-2){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
         int [] nums={3,2,1,0,4};
        System.out.println( canJump(nums));
    }
}
