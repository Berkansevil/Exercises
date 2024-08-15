package Ogrenci;

public class HeightOrder {


    public static void main(String[] args) {
        int[] height = {170, 180, 176, 165, 175, 190, 169, 172, 187, 178, 175};
        int longOnes = 0;
        int aliHeight = 190;
        for (int i = 0; i < height.length; i++) {
            if (height[i] > aliHeight) longOnes++;
        }
        int order = longOnes + 1;
        System.out.println("Ali  " + order);


    }




}
