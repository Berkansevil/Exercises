package Polymorphism;

public class DataBaseLogger extends BaseLogger {

    @Override
    public void baseLogger(String message){
        System.out.println("Logged to database  : " +message);
    }
}
