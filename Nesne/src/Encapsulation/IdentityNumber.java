package Encapsulation;

import java.util.Random;

public class IdentityNumber {
    private int id;
    private String birthPlace;
    private String identityNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    boolean result = true;

    public void setIdentityNumber(String identityNumber) {
        if (identityNumber.length() == 11) {
            for (int i = 0; i < identityNumber.length(); i++) {
                char character = identityNumber.charAt(i);
                if (Character.isDigit(character)) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
            if (result) {
                Random random = new Random();
                this.identityNumber = identityNumber;
                int boxOfficeNumber = random.nextInt(100);
                printResult("Box officer Number : " + boxOfficeNumber);
            } else {
                printResult("Please enter the whole character as number");
            }

        } else {
            printResult("Please enter the 11 digits number.");
        }

    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public void printResult(String result) {
        System.out.println(result);
    }

}
