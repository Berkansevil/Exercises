package Polymorphism;

public class Main {
    public static void showUserInfo(User user){
        user.showInfo();


    }

    public static void main(String[] args) {
    /*   User user=new User("Berkan","Türkiye",24);
        User user1=new PreimumUser(600,"Berkan","Fransa",20);
        User user2=new NormalUser("Ahmet","Almanya",19 );

        System.out.println("-- User Information --");
        showUserInfo(user);
        System.out.println("-- Preımuım User Information --");
        showUserInfo(user1);
        System.out.println("--Normal User ınformaiton --");
        showUserInfo(user2);


     */

       CustomerManager customerManager=new CustomerManager(new EmailLogger());
       customerManager.add();
    }


}
