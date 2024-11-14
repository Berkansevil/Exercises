package AdditioalInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExp {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        numbers.stream().forEach(number ->{
            System.out.println("number :" + number);
        });

     List<Integer> count= numbers.stream().filter(number -> number>2) .collect(Collectors.toList());
        System.out.println(count);
    }

}
