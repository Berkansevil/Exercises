package Ogrenci;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {
    /*
    public static void main(String[] args) {

        Random random=new Random();
        int [] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]= random.nextInt();
        }
        System.out.println("Before");
        printArrays(numbers);
        mergeSort();

        System.out.println("\nafter");
        printArrays(numbers);

    }
    private static  void mergeSort(int []inputArray){
        int inputLength=inputArray.length;
        if(inputArray.length<2){
            return;
        }
        int middleIndex=(inputLength)/2;
        int []leftHalf=new int [middleIndex];
        int[] rightHalf=new int[inputLength-middleIndex];
        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i]=inputArray[i];
        }
        for (int i = middleIndex; i <inputLength ; i++) {
            rightHalf[i-middleIndex]=inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);


    }

    public static void printArrays(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
     */
    public static void main(String[] args) {
        Random random =new Random();
        Scanner scanner =new Scanner(System.in);
        int [] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
           numbers[i]= random.nextInt(100000);
        }
        System.out.println("Before");
        print(numbers);

        System.out.println("\nAfter");
        mergeSort(numbers);
        print(numbers);

    }


    public static  void mergeSort(int[] inputArray){
        int inputLength=inputArray.length;
        if(inputLength<2){
            return;
        }
        int middleIndex=(inputLength)/2;
        int [] leftHalf=new int[middleIndex];
        int[] rightHalf=new int[inputLength-middleIndex];
        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i]=inputArray[i];
        }
        for (int i = middleIndex; i <inputLength ; i++) {
            rightHalf[i-middleIndex]=inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray,leftHalf,rightHalf);
    }
    public static void print(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static  void merge(int[] inputArray,int [] leftHalf,int [] rightHalf){
        int leftSize= leftHalf.length;
        int rightSize= rightHalf.length;
        int i=0, j=0, k=0;
        while(i<leftSize && j<rightSize){
             if(leftHalf[i] <=rightHalf[j]){
                 inputArray[k]=leftHalf[i];
                 i++;
             }else{
                 inputArray[k]=rightHalf[j];
                 j++;
             }
             k++;
        }
        while(i<leftSize){
            inputArray[k]=leftHalf[i];
            i++;
            k++;
        }
        while(j<rightSize){
            inputArray[k]=rightHalf[j];
            j++;
            k++;
        }


    }

}
