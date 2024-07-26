package Ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz ");
        int size= scanner.nextInt();
        int [] array=new int[size];
        int min =array[0];
        int max=array[0];

        for (int i = 0; i < size; i++) {
            System.out.println((i+1)+".nci değeri");
            array[i]= scanner.nextInt();

        }
        for (int i = 1; i < array.length; i++) {
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("Minimum değer " + min);
        System.out.println("Maksimum değer " + max);
    }
}
