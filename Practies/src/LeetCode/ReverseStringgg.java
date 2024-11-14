package LeetCode;

public class ReverseStringgg {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s[s.length - 1];

        while (start < end) {
            int temp = s[start];
            s[0] = s[s.length-1];
            s[s.length-1] = (char) temp;

            start++;
            end--;
        }

    }


}
