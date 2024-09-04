package EmailApplication;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String department;
    private int defaultPasswordLength=10;
    private int mailBoxCapacity;
    private String alternateEmail;
    private  String companySuffix="company.com";

    // constructor
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMAIL CREATED : " +this.firstName+ " " + this.lastName);
        this.department=setDepartment();
        System.out.println("Department:  " + this.department);
        this.password=randomPassword(defaultPasswordLength);
        System.out.println("Your password is : " +this.password);
        email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
        System.out.println("Your email is: " + email);
    }

    private String setDepartment(){
        System.out.println("Department Code\n1 for sales \n2 for Development \n3 for Account \n0 for None\nEnter department code : ");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        if(choice==1) return "sales";
        else if (choice==2) return "dev";
        else if (choice==3) return "acct";
        else return "";
    }
    private String randomPassword(int length){
        String passwordSet="ABCDEFGHIJKLMNOPRSTUVYZ0123456789!@#%";
        char[] password=new char[length];
        for (int i = 0; i < length; i++) {
            int random=(int)(Math.random() * passwordSet.length());
            password[i]=passwordSet.charAt(random);
        }
        return new String(password);
    }
}
