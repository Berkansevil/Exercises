package Overriding;

public class Main {
    public static void main(String[] args) {
        BaseCreditManager [] creditManagers={new TeacherCreditManager(),new AgricultureCreditManager(),new StudentCreditManager()};
        for (BaseCreditManager creditManager : creditManagers ) System.out.println(creditManager.creditAmount(1000));;
    }

}
