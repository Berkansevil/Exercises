package LeetCode;

import java.util.Arrays;

public class BinarySearch {


    public static   int binarySearch(int [] array,int target) {
        int left=0;
        int right=array.length-1;
        Arrays.sort(array);
        while(left<=right){
            int middle=(left+right)/2;
            int middleIndex=array[middle];
            if(middleIndex == target){
                return middleIndex;
            }
            if(middleIndex>target){
                left=middleIndex+1;
            }
            if(middleIndex<target){
                right=middleIndex-1;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        int array[] ={5,32,7,1,4,6};
        binarySearch(array,32);
    }
}
