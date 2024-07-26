package Employee;

import com.sun.security.jgss.GSSUtil;

public class EmpDriver {
    public static void main(String[] args) {
        Employee empDriver=new Employee("Kemal",2000,45,1985);
        System.out.println("Name : " + empDriver.name);
        System.out.println("Salary : " + empDriver.salary);
        System.out.println("Work Hours : " + empDriver.workHours);
        System.out.println("Hire Date : " + empDriver.hireYear);
        System.out.println("Tax: " +empDriver.tax(empDriver.salary));
        System.out.println("Bonus : " + empDriver.bonus());
        System.out.println("Raise of Salary" + empDriver.raiseSalary());
        System.out.println("Salary with tax and bonus : " + (empDriver.salary+empDriver.tax(empDriver.salary)+empDriver.bonus()));
    }
}
