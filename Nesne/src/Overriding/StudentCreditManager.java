package Overriding;

public class StudentCreditManager extends BaseCreditManager{
    @Override
    public double creditAmount(double amount){
       return amount * 1.10;
    }

}
