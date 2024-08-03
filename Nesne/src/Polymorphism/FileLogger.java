package Polymorphism;

public class FileLogger  extends BaseLogger{
    @Override
    public void baseLogger(String message){
        System.out.println("Logged to file  : " +message);
    }
}
