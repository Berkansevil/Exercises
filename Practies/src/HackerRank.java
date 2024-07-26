
import java.sql.SQLOutput;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class HackerRank {

   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("İlk değeri giriniz");
        String a=scanner.nextLine();
        System.out.println("İkinci değeriniz giriniz ");
        String b = scanner.nextLine();

        String [] arr3=a.split(",");
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }

       char [] arr1=a.toLowerCase().toCharArray();
       char [] arr2=b.toLowerCase().toCharArray();

       Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1,arr2)){ // for compare to arrays...use arrays class
            System.out.println("İs anagram");
        }
        else{
            System.out.println("Not anagram.");
        }
        LocalDate lc=LocalDate.now();
        System.out.println("Current date : " +lc);

        Date tarih = new Date();
        System.out.println(tarih);
       String year=lc.getDayOfWeek().toString();
       DateTimeFormatter first =DateTimeFormatter.ofPattern("dd/MM/YYYY");
        System.out.println(lc.format(first));
        System.out.println(year);

        double payment = scanner.nextDouble();
        NumberFormat ft=NumberFormat.getCurrencyInstance(Locale.ENGLISH);

        // Write your code here.

       // is anagram



    }
}
