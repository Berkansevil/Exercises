package bilgiSistemi;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SystemManagement systemManagement=new SystemManagement();
        while(true){
            System.out.println("Öğrenci bilgi sistemine hoşgeldiniz ");
            System.out.println("1.Öğrenci ekleme ");
            System.out.println("2.Öğrenci bilgilerini listele");
            System.out.println("3.Öğrenci bilgilerini güncelle");
            System.out.println("4.Öğrenci silme");
            System.out.println("5.ÇIKIŞ");
            System.out.print("Seçiminiz: ");
            int choice= scanner.nextInt();

            boolean isExit=false;
            switch (choice){
                case 1:
                    System.out.print("İsminizi giriniz :");
                    scanner.nextLine();
                    String name=scanner.nextLine();
                    System.out.print("Soyisminizi giriniz : ");
                    String surName= scanner.nextLine();
                    System.out.print("Mailinizi giriniz : ");
                    String email=scanner.nextLine();
                    systemManagement.addStudent(name,surName,email);
                    break;
                case 2:
                    systemManagement.listStudents();
                    break;
                case  3:
                    System.out.print("Yeni ıd: ");
                    int newId=scanner.nextInt();
                    System.out.print("Yeni email : ");
                    String newEmail=scanner.nextLine();
                    systemManagement.updateStudent(newId,newEmail);
                    System.out.println("Öğrenci başarıyla güncellendi.");
                    break;
                case 4:
                    System.out.println("Silinecek öğrencinin id'si:");
                    int deleteId= scanner.nextInt();
                    systemManagement.deleteStudent(deleteId);
                    break;
                case 5:
                    System.out.println("Çıkış yapılıyor...");
                    isExit=true;
                    break;
            }

            if(isExit){
                break;
            }
        }

    }
}
