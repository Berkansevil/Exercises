package Ogrenci;

import java.sql.SQLOutput;

public class StairCase {

    public static void main(String[] args) {
        reverseTriangle(5);
    }

    public static void stairCase(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void triangle(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

    }

    public static void reverseTriangle(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <N-i ; j++) {
                System.out.print("#");
            }
            System.out.println();

        }
    }
}
