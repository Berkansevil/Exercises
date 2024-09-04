package Ogrenci;

import java.util.Scanner;

public class SelectionSort {
    // 3,5,10,1,8
    public static void selectionSort() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diziniz kaç boyutlu olsun : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Dizininiz elemanlarını giriniz : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ".elemanı giriniz :");
            array[i] = scanner.nextInt();
        }

        System.out.println("Dizinin selection sort ile sıralanmış hali:");
        int min, temp;
        for (int i = 0; i < size - 1; i++) {
            min = i;
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[i]) {
                    min = j;
                }
            }
            // swap
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i]);
        }
    }

    public static void main(String[] args) {
        selectionSort();
    }
    public static void sortArray(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diziniz kaç boyutlu olsun : ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Dizininiz elemanlarını giriniz : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + ".elemanı giriniz :");
            array[i] = scanner.nextInt();
        }
        // 3,5,2,6,7
        System.out.println("Dizinin  sort ile sıralanmış hali:");
        for (int i = 0; i < array.length; i++) {
            int temp;
            for (int j = i+1; j < array.length ; j++) {
                if(array[i]<array[j]){
                        temp=array[i];
                        array[i]=array[j];
                        array[j]=temp;

                }
            }
        }

    }


}
