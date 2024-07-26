package Ogrenci;

import java.util.Random;
import java.util.Scanner;

public class HangmanDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = {"Ankara", "İzmir", "İstanbul", "Çanakkale"};
        Random random=new Random();
        String wordGuess=words[random.nextInt(words.length)];
     //   System.out.println(wordGuess);
        boolean [] guessLetters=new boolean[wordGuess.length()];
        int remainingGuess=6;
        System.out.println("Adam asmaca oyununa hoşgeldiniz ");
        System.out.println("Kelime giriniz ");

        while(remainingGuess>0){
            for (int i = 0; i < wordGuess.length(); i++) {
                if(guessLetters[i]){
                    System.out.println(wordGuess.charAt(i)+"");
                }else{
                    System.out.println(" _ ");
                }

            }
            System.out.println("Kalan tahmin hakkınız " + remainingGuess);
            System.out.println("Harf giriniz ");
            char guess=scanner.next().charAt(0);
            boolean isFound=false;

            for (int i = 0; i < wordGuess.length(); i++) {
                if(wordGuess.charAt(i)==guess){
                    guessLetters[i]=true;
                    isFound=true;
                }
            }
        }
    }
}
