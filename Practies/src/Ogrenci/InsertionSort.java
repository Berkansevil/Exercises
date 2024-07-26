package Ogrenci;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diziniz kaç boyutlu olsun : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Dizininiz elemanlarını giriniz : ");
        for (int i = 0; i < array.length; i++) {
            System.out.print((i + 1) + ".elemanı giriniz :");
            array[i] = scanner.nextInt();
        }
        // 5,3,2,6,7
        System.out.println("Dizinin  sort ile sıralanmış hali:");
        int key;
        int j;
        for (int i = 1; i < array.length ; i++) {
            key=array[1];
            j=i-1;
            while( array[j]>key && j>=0){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=key;
        }
        for (int i = 0; i < array.length ; i++) {
            System.out.println(array[i]);
        }

    }
}
