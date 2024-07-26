package LeetCode;

public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord=new LengthOfLastWord();
        lengthOfLastWord.lengthOfLastWord("Hello World berkan");
        System.out.println(lengthOfLastWord);
    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (!(s.charAt(i) == ' ')){
                count++;
            }

            else
                break;


        }
        return count;
    }


}
