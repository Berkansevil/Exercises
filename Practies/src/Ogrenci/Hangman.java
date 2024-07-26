package Ogrenci;

import java.util.Random;
import java.util.Scanner;

public class Hangman {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[] words = {"istanbul", "Meksika", "Avusturya", "Kanada", "Afrika", "Isveç"};
        String wordGuess = words[random.nextInt(words.length)];
        System.out.println(wordGuess);

        boolean[] guessLetters = new boolean[wordGuess.length()];
        int remainingGuess = 6;
        System.out.println("Adam asmaca oyununa hoşgeldiniz ");
        System.out.println("Kelimeyi tahmin etmek için harf girişi yapın. ");

        while (remainingGuess > 0) {
            System.out.println("");
            for (int i = 0; i < wordGuess.length(); i++) {
                if (guessLetters[i]) {
                    System.out.print(wordGuess.charAt(i) + " ");
                } else {
                    System.out.print(" _ ");
                }
            }
            System.out.println("");
            System.out.println("Kalan tahmin hakkınız : " + remainingGuess);
            System.out.print("Harf girin : ");
            char guess = scanner.next().toLowerCase().charAt(0);
            boolean isFound = false;

            for (int i = 0; i < wordGuess.length(); i++) {
                if (wordGuess.toLowerCase().charAt(i) == guess) {
                    guessLetters[i] = true;
                    isFound = true;
                }
            }

            if (isFound) {
                System.out.println("Harf doğru tahmin edildi");
            } else {
                remainingGuess--;
                System.out.println("Harf bulunamadı. Yanlış tahmin !");
            }

            boolean isComplete = true;
            for (boolean letter : guessLetters) {
                if (!letter) {
                    isComplete = false;
                    break;
                }
            }

            if(isComplete){
                System.out.println("Tebrikler ! kelimeyi doğru tahmin ettiniz." + wordGuess);
                break;
            }
        }
        if(remainingGuess==0){
            System.out.println("Tahmin hakkınız bitti. Adam asıldı!");
            System.out.println("Doğru kelime : " + wordGuess);
        }

    }

}
