package Ogrenci;

import java.awt.*;
import java.util.Scanner;

public class AvarageOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Diziniz kaç boyutlu olsun ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ". elemanı giriniz : ");
            array[i] = scanner.nextInt();

        }
        print(array);
        System.out.println("Dizinizin ortalaması:");
        double sum=0,avarage=0;

        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
            avarage=(sum)/size;

        }
        System.out.println(avarage);

    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
