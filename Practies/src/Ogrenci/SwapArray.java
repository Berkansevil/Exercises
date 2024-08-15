package Ogrenci;

public class SwapArray {
    public static void main(String[] args) {
        int[] numbers = {10, 13, 56, 20, 40, 60, 56, 32};
        int enBuyuk = numbers[0];
        int siraB = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > enBuyuk) {
                enBuyuk = numbers[i];
                siraB = i;
            }
        }
        System.out.println(enBuyuk);

        int enKucuk = numbers[0], sıraK = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < enKucuk) {
                enKucuk = numbers[i];
                sıraK = i;
            }
        }
        System.out.println(enKucuk);

        int temp = numbers[siraB];
        numbers[siraB] = numbers[sıraK];
        numbers[sıraK] = temp;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        // en küçükle en büyük değerler arasındaki değerlerin toplamı :
        int sum = 0;
        if (sıraK < siraB) {
            for (int i = sıraK + 1; i < siraB; i++) {
                sum += numbers[i];
            }
        } else
            for (int i = siraB + 1; i < sıraK; i++) {
                sum += numbers[i];

            }

    }
}
