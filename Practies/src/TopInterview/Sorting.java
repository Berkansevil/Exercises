package TopInterview;

public class Sorting {
    public static void insertionSort(int[] nums){
        // 65,27,40,20,5;
       int min , temp;
        for (int i = 0; i < nums.length-1; i++) {
            min=i;
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[i]<nums[j]){
                    min=j;
                }
            }
            temp=nums[min];
            nums[min]=nums[i];
            nums[i]=temp;
        }
        for (int i = 0; i <nums.length ; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int [] array={65,27,40,20,5};
        insertionSort(array);
    }
}
