package Encapsulation;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Welcome to the box office application ");
        System.out.print("Please enter the identity number :" );
        Scanner scanner=new Scanner(System.in);
        String identityNumber=scanner.nextLine();
        IdentityNumber tckn=new IdentityNumber();
        tckn.setIdentityNumber(identityNumber);


    }

}
