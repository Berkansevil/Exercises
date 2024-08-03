package Polymorphism;

public class PreimumUser extends User {
    private  double price;
    public PreimumUser(double price ,String name, String country, int age) {
        super(name, country, age);
        this.price=price;
    }

    @Override
    public void showInfo(){
        super.showInfo();
        System.out.println("amount to be paid annually " + price + "TL ");
    }
}
