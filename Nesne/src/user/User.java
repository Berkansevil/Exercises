package user;

public class User {

    public int number;
    public String name;
    public String lastName;
    public int experience;
    public double salary;

    public User(int number, String name, String lastName, int experience, double salary) {
        this.number = number;
        this.name = name;
        this.lastName = lastName;
        this.experience = experience;
        this.salary = salary;
    }

    public User() {

    }

    public void getUserWorkInformation() {
        System.out.println("************ User ınformation**********");
        System.out.println("Number : " + number);
        System.out.println("Name : " + name);
        System.out.println("Lastname : " + lastName);
        System.out.println("experince : " + experience);
        System.out.println("Salary : " + salary);

    }

    public void getRaise(int raise) {
        System.out.println("Your salary " + raise + "Tl  has been increased");
        System.out.println("Your current salary " + (salary + raise));
    }

    public void toFormat(String operatingSystem, String who) {
        System.out.println(who + " now " + operatingSystem + "to formating");
    }

}

