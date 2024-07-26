package meinfield;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Mayın tarlası oyununa hoşgeldiniz");
        System.out.println("Lütfen oynamak istediğiniz boyutları giriniz ");
        System.out.print("Satır sayısı :");
       int row=scanner.nextInt();
        System.out.print("Sütun sayısı :");
         int column= scanner.nextInt();
        MeinField meinField=new MeinField(row,column);
        meinField.run();
    }


}
