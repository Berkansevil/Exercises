package Ogrenci;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatingNumber {
    Scanner scanner=new Scanner(System.in);

    // 1,1,4,3,6,2,4,1
    // 0,1,0,0,0,0,0,1

    public void RepeatingNumberOfArray(){
        System.out.println("Diziniz kaç boyutlu olsun");
        int size=scanner.nextInt();
        int [] array=new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println((i+1)+".dizinin elemanını giriniz ");
            array[i]= scanner.nextInt();
        }
        // dizide tekrar eden sayıyı bulma
        boolean [] checked=new boolean[array.length];
        for (int i = 0; i < array.length; i++) {
            int count=1;
            if(!checked[i]){
                for (int j = i+1; j < array.length ; j++) {
                    if(array[i]==array[j]){
                        count++;
                        checked[j]=true;
                    }

                }
            }
            if(count>1){
                System.out.println(array[i]+"("+count+"kez");
            }

        }



    }
}
