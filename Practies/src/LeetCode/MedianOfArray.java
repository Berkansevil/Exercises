package LeetCode;

import java.util.Arrays;

public class MedianOfArray {

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double avarage,sum = 0;
        int [] temp=new int[nums1.length+nums2.length];
        for (int i = 0; i < nums1.length; i++) {
            temp[i]=nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            temp[nums1.length+i]=nums2[i];
        }
        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            sum+=temp[i];
        }
        if(temp.length%2==0){
            avarage=(sum)/ temp.length;
            System.out.println(avarage);
            return avarage;
        }else {
            int middle1 = temp[temp.length / 2 - 1];
            int middle2 = temp[temp.length / 2];
            System.out.println(((double) middle1 + (double) middle2) / 2.0);
            return ((double) middle1 + (double) middle2) / 2.0;
        }

    }

    public static void main(String[] args) {
        int [] nums1={1,3};
        int [] nums2={2};
        findMedianSortedArrays(nums1,nums2);
    }
}
