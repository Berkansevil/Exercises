package Ogrenci;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        int randomNumber=random.nextInt(100);
        System.out.println(randomNumber);
        boolean gameState=false;
        System.out.println("Tahmin oyununa hoşgeldiniz ");
        System.out.println("1 ile 99 arasında  bir  sayı tahmin edin");
        int guess=0 ,lives=5;

        while(lives>0){
            System.out.println("Tahmininiz : ");
            guess=scanner.nextInt();
            if(guess<0 || guess>99){
                System.out.println("Lütfen değerler arasında veri giriniz....");
                continue;
            }
            if(guess==randomNumber){
                System.out.println("Tebrikler doğru yanıt verdiniz ");
                break;
            }else {
                System.out.println("Yanlış tekrar deneyiniz . Kalan canınız : " + --lives);
            }
            if(gameState){
                System.out.println("Tebrikler doğru tahmin ");
                System.out.println("Sayımız " + randomNumber);
                System.out.println("Kalan can " + lives);
            }else {
                System.out.println("Başaramadınız ");
            }
        }

    }
}
