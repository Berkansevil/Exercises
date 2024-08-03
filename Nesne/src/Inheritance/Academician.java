package Inheritance;

public class Academician extends Worker{
    private  String department;
    private String title;
    public Academician(String fullName, String phoneNumber, String email,String department,String title) {
        super(fullName, phoneNumber, email);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    public void attendClass(){
        System.out.println(this.getFullName() + " attend the class ");
    }
    @Override
    public void enter(){
        System.out.println(this.getFullName()+" enter the A gate");
    }
}
