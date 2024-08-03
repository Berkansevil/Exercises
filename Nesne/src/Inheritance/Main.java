package Inheritance;

public class Main {

    public static void main(String[] args) {
        Worker worker=new Worker("Berkan","69497679040","berkan@hotmail.com");
        Academician academician=new Academician("ahmet","54757","ahmet@gmail.com","math","professor");
        Worker [] loginUsers={worker,academician};
        Worker.logInUsers(loginUsers);
    }

}
