package LeetCode;

public class ReverseString {

    public static void reverseWords(String s) {
        s.trim();
        String[] sentences = s.split(" ");

        StringBuilder reversedSentence = new StringBuilder();
        for (int i = sentences.length - 1; i >= 0; i--) {
            reversedSentence.append(sentences[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }
        System.out.println(reversedSentence);

    }

    public static void main(String[] args) {
        String s = "a good   example";
        reverseWords(s);
    }

//    Input: s = "the sky is blue"
//    Output: "blue is sky the"
}
