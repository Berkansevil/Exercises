package Polymorphism;

public class EmailLogger extends  BaseLogger{
    @Override
    public void baseLogger(String message){
        System.out.println("Logged to email  : " +message);
    }
}
