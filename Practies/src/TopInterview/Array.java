package TopInterview;

public class Array {
    // Input: nums = [1,1,2,2,3,4,5]
    //Output: 2, nums = [1,2,_]


    public static void main(String[] args) {
    int [] array={1,1,2,2,3,4,5};
    int n=array.length;
    int j=0;
        for (int i = 0; i < n-1; i++) {
            if(array[i]!=array[i+1]){
                array[j]=array[i];
                j++;
            }
        }
        array[j]=array[n-1];
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
