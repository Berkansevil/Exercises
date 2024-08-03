package Inheritance;

public class Worker {
    private  String fullName;
    private String phoneNumber;
    private String email;


    public Worker(String fullName,String phoneNumber,String email){
        this.fullName=fullName;
        this.phoneNumber=phoneNumber;
        this.email=email;
    }

    public String getFullName(){
        return fullName;
    }
    public void setFullName(String fullName){
        this.fullName=fullName;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email=email;
    }

    public void enter(){
        System.out.println(this.fullName +"Logged in ");
    }
    public void enter(String enterClock){
        System.out.println(this.fullName + enterClock + " enter the class");
    }
    public void exit(){
        System.out.println(this.fullName + "Exited");
    }
    public void diningHall(){
        System.out.println( this.fullName + "Entrance to dining hall");
    }
    public static void logInUsers(Worker [] logInUsers ){
        for (Worker worker:logInUsers){
            worker.enter();
        }
    }

  }

