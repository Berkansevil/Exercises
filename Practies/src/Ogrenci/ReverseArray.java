package Ogrenci;

import java.awt.*;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("How much  your array of size : ");
        int size= scanner.nextInt();
        int [] array=new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+".value  : ");
            array[i]=scanner.nextInt();
        }
        int [] newArray=new int[size];
        for (int i = 0; i < array.length; i++) {
            newArray[size-i-1]=array[i];
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }
        int temp;
        for (int i = 0; i < (array.length)/2; i++) {
         temp=array[i];
         array[i]=array[size-i-1];
         array[size-i-1]=temp;
        }
    }
}
