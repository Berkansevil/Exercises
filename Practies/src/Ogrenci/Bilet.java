package Ogrenci;

import java.util.Scanner;

public class Bilet {
    public static void main(String[] args) {
      //Girilen yıl 4 e tam bölünmeli - 100 ve 400 e de tam bölünmeli -- 400 e de tam bülünmeli
        Scanner scanner=new Scanner(System.in);
        System.out.println("Yılı giriniz ");
        int year=scanner.nextInt();
        boolean artıkYıl=false;
        if(year%4 ==0){
           artıkYıl=true;
        } else if (year % 100 == 0 && year %400==0) {
           artıkYıl =true;
        } else if (year % 400 ==0) {
            artıkYıl=true;
        }
        else {
          artıkYıl=false;
        }
        if(artıkYıl){
            System.out.println("Yılınız artık yıldır");
        }
        else{
            System.out.println("Yılınız artık yıl değildir");
        }
    }
}
