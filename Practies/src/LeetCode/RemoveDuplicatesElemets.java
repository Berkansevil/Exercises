package LeetCode;

public class RemoveDuplicatesElemets {
    public static void main(String[] args) {
        int [] nums={0,1,2,2,3,0,4,2};
        int index=0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length ; j++) {
                if(nums[i]==nums[j]){
                    nums[index]=nums[i];
                    index++;
                }else {
                    nums[index]=nums[j];
                    index++;
                }
            }
        }
    }
}
