package Encapsulation;

public class Officer {
    private  String name;
    private String surName;
    private int userId;
    private int salary;

    public Officer (){

    }
    public Officer(String name, String surName, int userId, int salary) {
        this.name = name;
        this.surName = surName;
        this.userId = userId;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
