package Ogrenci;

import java.util.Scanner;

public class MatrisTranpoz {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Satır sayısını giriniz  ");
        int rows= scanner.nextInt();
        System.out.print("Sütun sayısını giriniz : ");
        int colums= scanner.nextInt();
        int [][] array=new int[rows][colums];
        System.out.print("Matrisin elemanlarını giriniz : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                array[i][j]= scanner.nextInt();
                print(array);
            }
        }
        int newRows=colums;
        int newColums=rows;
        int[][] transpoze=new int[newRows][newColums];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < colums; j++) {
                transpoze[j][i]=array[i][j];
            }
        }
        System.out.println("Matrisin transpoz edilmiş hali  : ");
        print(transpoze);

    }

    public static void print(int [][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
