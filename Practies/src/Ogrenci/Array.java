package Ogrenci;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dizinin boyutunu belirleyin");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        double sum=0;

        for (int i = 1; i < numbers.length; i++) {
            System.out.print(i + ". elemanı giriniz ");
            numbers[i]=scanner.nextInt();
            sum+=numbers[i];
        }
        double result=sum/ numbers.length;
        System.out.println("Dizideki sayıların ortalaması : " + result);




    }
}
