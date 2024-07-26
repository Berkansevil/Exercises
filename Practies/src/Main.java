import Ogrenci.Oğrenci_1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    // Kodlama vakti 41 - alıştırma -youtube videosu
        // 1.Soru Öğrenci not ortalaması hesaplama
       int tarih,biyoloji,kimya,mat;
        Scanner scanner=new Scanner(System.in);
        /*
        System.out.println("Not Hesaplama Menüsüne Hoşgeldiniz ");
        System.out.print("Tarih dersinin notunu giriniz ");
        tarih=scanner.nextInt();
        System.out.print("Matematik dersinin notunu giriniz ");
         mat=scanner.nextInt();
        System.out.print("Biyoloji dersinin notunu giriniz ");
         biyoloji=scanner.nextInt();
        System.out.print("Kimya dersinin notunu giriniz ");
         kimya=scanner.nextInt();
        double notOrtalama=(tarih+mat+biyoloji+kimya)/(4);
        if(notOrtalama<60){
            System.out.println("Bu sene başarısız oldunuz " + "Not ortalamanız " + notOrtalama);
        } else {
            System.out.println("Bu sene başarılı oldunuz : " + "Not ortalamanız " + notOrtalama);
        }
         */
        // Hipotenüs hesaplayan bir program :
        System.out.println("1.Kenarı giriniz ");
        int a=scanner.nextInt();
        System.out.println("2.kenarı giriniz : ");
        int b=scanner.nextInt();
        double c = Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüz " +c);
       double u =(a+b+c)/2;
       double perimeter=(2*u);
       double area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println(perimeter);
        System.out.println(area);
        // Bki Hesaplama
        System.out.println("Lütfen boyunuzu giriniz : ");
       int boy= scanner.nextInt();
        System.out.println("Lütfen kilonuzu giriniz ");
        int kılo=scanner.nextInt();
        double bki=(kılo)/(Math.pow(boy,2));
        System.out.println(bki);
        // Dairenin alanı ve çevresini
        System.out.println("Yarıçapı giriniz : ");
        double yarıÇap=scanner.nextDouble();
        double areaOfCircle=(Math.PI)*(Math.pow(yarıÇap,2));
        double perimeterOfCircle=(2*(Math.PI)*(yarıÇap));
        System.out.printf("Dairenın alanı : " + areaOfCircle);
        System.out.println("Dairenın çevresi " + perimeterOfCircle);

       Fibonacci(10);
    }
    static void Fibonacci(int N)
    {
        int num1 = 0, num2 = 1;
        for (int i = 0; i < N; i++) {
            // Print the number
            System.out.print(num1 + " ");

            // Swap
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
        }
    }
}