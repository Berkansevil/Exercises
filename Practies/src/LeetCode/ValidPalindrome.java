package LeetCode;

public class ValidPalindrome {

//    Input: s = "A man, a plan, a canal: Panama"
//    Output: true
//    Explanation: "amanaplanacanalpanama" is a palindrome.


    public static boolean isPalindrome(String s) {
        String newString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (newString.charAt(start) != newString.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        isPalindrome(s);
    }
}
