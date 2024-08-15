package exception;

import java.util.Scanner;

public class ExceptionData {


    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
        System.out.println("Yaşınızı giriniz ");
        int age=scanner.nextInt();
        try{
            checkAge(age);
        }catch (Exception e){
            System.out.println("Yaşta problem var");
        }

    }

    public static void checkAge(int age) throws Exception{
        if(age< 18){
            throw new Exception("Yaşı yanlış girdiniz !");
        }
        System.out.println("Yaşta bir problem yok");
    }
}
