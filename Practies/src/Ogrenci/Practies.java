package Ogrenci;

public class Practies {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before");
        printArray(numbers);
        System.out.println("After \n");
        insertionSort(numbers);
        printArray(numbers);
        ;
    }


    public static void selectionSort(int[] array) {


        for (int i = 0; i < array.length; i++) {
            int temp;
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

        }

    }

    public static void insertionSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (array[j] > temp && j >= 0) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }


}
