package LeetCode;

import java.util.Arrays;

public class RemoveElements {
    public static void main(String[] args) {
        int [] number={0, 1, 2, 2, 3, 0, 4, 2};
        int val=2;
        int newElement= removeElement(number,val);
        System.out.println("Yeni uzunluk : " +newElement);
        for (int i = 0; i < newElement; i++) {
            System.out.println(number[i]);
        }
    }

        public static int removeElement(int[] nums, int val) {
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[index] = nums[i];
                    index++;
                }
            }
            return index;
        }
    }

