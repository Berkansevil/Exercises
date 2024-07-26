package Ogrenci;

import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print(  "Bir cümle giriniz ");
        String text=scanner.nextLine();
        System.out.println("Hangi kelimeyi aramak istiyorsunuz");
        char kelime=scanner.next().charAt(0);
        int frekans=0;
        for (int i = 0; i < text.length(); i++) {
           if(text.charAt(i)==kelime){
               frekans ++;
           }
        }
        System.out.println("Girilen cümle " + kelime +"harfi " + frekans+"kez kullanıldı");
    }
}
