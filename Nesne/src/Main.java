import user.User;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hoşgeldiniz ");
        Scanner scanner=new Scanner(System.in);

        System.out.println("Numaranızı giriniz ");
        int number= scanner.nextInt();
        System.out.println("İsminizi giriniz ");
        String name= scanner.nextLine();
        scanner.nextLine();
        System.out.println("Soyisminizi giriniz ");
        String lastName= scanner.nextLine();
        System.out.println("Deneyiminizi giriniz ");
        int experience= scanner.nextInt();
        System.out.println("Maaşınızı  giriniz ");
        double salary= scanner.nextDouble();

        User user=new User();

        String operations="1-Show the working information \n 2-Raise \n Format";
        System.out.println(operations);
        System.out.println("-------------------");
        System.out.println("Choose your operation");
        int choose= scanner.nextInt();
        switch (choose){
            case 1:
            user.getUserWorkInformation();
            break;
        }



    }
}