package meinfield;

import java.util.Random;
import java.util.Scanner;

public class MeinField {
    int rowNumber;
    int columnNumber;
    int size;
    int[][] map;
    int[][] board;
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    boolean game = true;

    MeinField(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.map = new int[rowNumber][columnNumber];
        this.board = new int[rowNumber][columnNumber];
        this.size = rowNumber * columnNumber;
    }

    public void run() {
        prepareGame();
        printArray(map);
        System.out.println("Oyun başladı : ");
        int success=0;
        while (game) {
            printArray(board);
            System.out.print("Satır :");
            int row = scanner.nextInt();
            System.out.print("Sütun : ");
            int column = scanner.nextInt();
            if (map[row][column] != -1) {
                checkMein(row, column);
                success++;
                if(success==(size)-(size/4)){
                    System.out.println("Başardınız hiçbir mayına basmadınız.Tebrikler");
                    break;
                }
            } else {
                game=false;
                System.out.println("Game over !");
            }

        }
    }

    public void checkMein(int row, int column) {
        if (map[row][column] == 0) {

            if ( (column<columnNumber-1) && (map[row][column + 1] == 1)) {
                board[row][column ]++;
            }
            if ( ( row>0 ) && (map[row - 1][column] == 1)) {
                board[row ][column]++;
            }
            if ((row<rowNumber-1 ) && (map[row + 1][column] == 1)) {
                board[row ][column]++;
            }
            if ((column>0) &&( map[row][column - 1] == 1)) {
                board[row][column ]++;
            }
            if(board[row] [column]==0){
                board[row][column]=-2;
            }
        }
    }

    public void prepareGame() {
        int randRandom, colRandom, count = 0;
        while (count != (size / 4)) {
            randRandom = random.nextInt(rowNumber);
            colRandom = random.nextInt(columnNumber);
            if (map[randRandom][colRandom] != -1) {
                map[randRandom][colRandom] = -1;
                count++;
            }
        }
    }

    public void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }


}
