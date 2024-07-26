package Ogrenci;

public class PalindromWord {
    public static void main(String[] args) {
        String word = "Yatap";
        char[] words = word.toLowerCase().toCharArray();
        boolean isFound = false;
        for (int i = 0; i < words.length; i++) {

            for (int j = words.length - 1; j >= 0; j--) {
                if (words[i] == words[j]) {
                    isFound = true;
                } else {
                    isFound = false;
                }
            }

        }
        if (isFound) {
            System.out.println("Tebrikler");
        } else {
            System.out.println("Yanlış cevap verdiniz ");
        }


    }


}
