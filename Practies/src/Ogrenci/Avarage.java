package Ogrenci;

import java.util.Scanner;

public class Avarage {

    public void  avarageOfArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diziniz kaç boyutlu olsun ");
        int size = scanner.nextInt();
        int [] array=new int[size];
        // girilen elemanları yazdır
        System.out.println("Dizinizin elemanlarını yazınız ");
        int sum = 0;
        double avarage = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". elemanını giriniz : ");
            array[i] = scanner.nextInt();
            sum += array[i];
        }
        avarage = (double) sum / array.length;
        System.out.printf("Ortalaması "+"%.2f   ", avarage); // 2 basamaklı yapmak için kullanıyoruz.
    }
}
