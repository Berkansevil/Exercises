package Polymorphism;

public class CustomerManager {
    private final BaseLogger baseLogger;

    CustomerManager(BaseLogger baseLogger){
        this.baseLogger=baseLogger;
    }
    public void add(){
        this.baseLogger.baseLogger("Müşteri eklendi");
    }
}
