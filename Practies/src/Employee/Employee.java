package Employee;

public class Employee {
    public String name;
    public double salary;
    public int workHours;
    public int hireYear;


    public Employee(String name,double salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }

    public double tax(double salary){
        if(this.salary <= 1000){
            return salary;
        }else{
            return salary*0.03;
        }
    }
    public double bonus(){
        double hour=workHours-40;
        return hour*30;
    }
    public double raiseSalary(){
        double year=2024-this.hireYear;
        if(year<10){
            return salary*0.05;
        } else if (year <20 && year >9) {
            return salary*0.10;
        }else if(year >19){
            return salary*0.15;
        }
        return 0.0;
    }

}
