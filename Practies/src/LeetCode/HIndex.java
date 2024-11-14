package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;



public class HIndex {
    public static void main(String[] args) {
        int[] arrs = {3, 0, 6, 1, 5}; // 6 5 3 1 0
        hIndex(arrs);
    }
    public static int hIndex(int[] citations) {
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);

        Arrays.sort(arr, Comparator.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= i) {
                return i;
            }
        }

        return arr.length;
    }
}
