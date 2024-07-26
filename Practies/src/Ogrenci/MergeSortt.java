package Ogrenci;

public class MergeSortt {
    public static void main(String[] args) {
        int[] numbers = {38, 27, 43, 3, 9, 82, 10};
        System.out.println("Before");
        printArray(numbers);
        System.out.println("After");
        mergeSort(numbers);
        printArray(numbers);

    }

    public static void mergeSort(int[] inputArray) {
        int inputLength = inputArray.length;
        if (inputLength < 2) {
            return;
        }
        int middleIndex = (inputLength) / 2;
        int[] leftHalf = new int[middleIndex];
        int[] rightHalf = new int[inputLength - middleIndex];
        for (int i = 0; i < middleIndex; i++) {
            leftHalf[i] = inputArray[i];
        }
        for (int i = middleIndex; i < inputLength; i++) {
            rightHalf[i - middleIndex] = inputArray[i];
        }
        mergeSort(leftHalf);
        mergeSort(rightHalf);
        merge(inputArray,leftHalf,rightHalf);
    }

    public static void merge(int[] inputArray, int[] leftArray, int[] rightArray) {
        int leftSize = leftArray.length;
        int rigthSize = rightArray.length;

        int i=0, j=0, k = 0;
        while (i<leftSize && j<rigthSize){
            if(leftArray[i]<=rightArray[j]){
                inputArray[k]=leftArray[i];
                i++;
            }else{
                inputArray[k]=rightArray[j];
                j++;
            }
            k++;
        }
        while(i<leftSize){
            inputArray[k]=leftArray[i];
            i++;
            k++;
        }
        while(j<rigthSize){
            inputArray[k]=rightArray[j];
            j++;
            k++;
        }
    }

    public static void printArray(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
        }
    }


}
