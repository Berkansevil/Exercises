package LeetCode;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne plusOne=new PlusOne();
        int [] array={1,2,3};
        plusOne.plusOne(array);
        print(array);
    }

    public int[] plusOne(int[] digits) {
        /*
        Input: digits = [1,2,3]
        Output: [1,2,4]

         Input: digits = [9]
         Output: [1,0]
         */
        for (int i = digits.length-1; i >=0 ; i--) {
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int [] numbers=new int[digits.length+1];
        numbers[0]=1;
        return  numbers;
    }
    public  static void print(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
