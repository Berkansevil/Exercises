package Polymorphism;

public class Main {
    public static void showUserInfo(User user){
        user.showInfo();


    }

    public static void main(String[] args) {
      User user=new User("Berkan","Türkiye",24);
        User userPreimum=new PreimumUser(600,"Berkan","Fransa",20);
        /*
        User userPreimum ;
        PreimumUser preimumUser=new PreimumUser();
        user1=preimumUser;
        UpCasting
         */
        User userNormal=new NormalUser("Ahmet","Almanya",19 );



        System.out.println("-- User Information --");
        showUserInfo(user);
        System.out.println("-- Preımuım User Information --");
        showUserInfo(userPreimum);
        System.out.println("--Normal User ınformaiton --");
        showUserInfo(userNormal);




       //  CustomerManager customerManager=new CustomerManager(new EmailLogger());
      // customerManager.add();
    }


}
